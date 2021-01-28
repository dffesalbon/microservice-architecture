/**
 * 
 */
package com.service.user.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.service.user.commons.ClientService;
import com.service.user.dto.Userdata;
import com.service.user.entity.Useraccount;
import com.service.user.repository.UserRepository;

/**
 * @author danielf
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

	@Override
	@Transactional
	public Userdata saveOrUpdate(Userdata user) {
		// TODO Auto-generated method stub
		try {

			Useraccount u = new Useraccount();
			u.setUsername(user.getUsername());
			u.setPassword(user.getPassword());
			u.setEmail(user.getEmail());
			userRepository.save(u);
			return user;

		} catch (Exception e) {
			LOGGER.warn("Problem saving user " + user.toString() + ". Message" + e);
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public Userdata getById(String username) {
		// TODO Auto-generated method stub
		try {

			Useraccount u = userRepository.getOne(username);
			return new Userdata(u.getUsername(), u.getPassword(), u.getEmail());

		} catch (Exception e) {
			LOGGER.warn("Problem getting user: " + username + "'s details. Message" + e);
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public List<Userdata> getAll() {
		// TODO Auto-generated method stub
		List<Userdata> list = new ArrayList<Userdata>();

		try {
			LOGGER.info("getting all user");
			LOGGER.info(ClientService.getRequest("http://localhost:8002", "/group-service/group/all"));
			kafkaTemplate.send("topic", "key", "string data");
			for (Useraccount u : userRepository.findAll()) {
				list.add(new Userdata(u.getUsername(), u.getPassword(), u.getEmail()));
			}
			return list;

		} catch (Exception e) {
			LOGGER.warn("Problem get user list. Message" + e);
			// TODO: handle exception
		}
		return null;
	}

}

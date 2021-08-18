/**
 * 
 */
package com.service.user.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.service.user.commons.ClientService;
import com.service.user.entity.Message;
import com.service.user.entity.Useraccount;

/**
 * @author danielf
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

	@Override
	public Useraccount saveOrUpdate(Useraccount user) {
		// TODO Auto-generated method stub
		try {

			Useraccount u = new Useraccount();
			u.setUsername(user.getUsername());
			u.setPassword(user.getPassword());
			u.setEmail(user.getEmail());
			return u;

		} catch (Exception e) {
			LOGGER.warn("Problem saving user " + user.toString() + ". Message " + e);
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public Useraccount getById(String username) {
		// TODO Auto-generated method stub
		try {

			return new Useraccount(username, "password", "sample@email.com");

		} catch (Exception e) {
			LOGGER.warn("Problem getting user: " + username + "'s details. Message " + e);
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public List<Useraccount> getAll() {
		// TODO Auto-generated method stub
		List<Useraccount> list = new ArrayList<Useraccount>();

		try {
			LOGGER.info("getting all user");
			LOGGER.info(ClientService.getRequest("http://localhost:8002", "/group-service/group/all"));
			kafkaTemplate.send("topic", "key", "string data");

			list.add(new Useraccount("username", "password", "sample@gmail.com"));
			list.add(new Useraccount("username", "password", "sample@gmail.com"));
			list.add(new Useraccount("username", "password", "sample@gmail.com"));

			return list;

		} catch (Exception e) {
			LOGGER.warn("Problem get user list. Message " + e);
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public void sendMessage(Message message) {
		// TODO Auto-generated method stub
		try {

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}

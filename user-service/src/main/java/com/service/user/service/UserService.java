/**
 * 
 */
package com.service.user.service;

import java.util.List;

import com.service.user.dto.Userdata;
import com.service.user.entity.Message;

/**
 * @author danielf
 *
 */
public interface UserService {

	Userdata saveOrUpdate(Userdata user);

	Userdata getById(String username);

	List<Userdata> getAll();

	void sendMessage(Message message);

}

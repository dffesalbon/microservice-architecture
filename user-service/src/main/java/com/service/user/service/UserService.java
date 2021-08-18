/**
 * 
 */
package com.service.user.service;

import java.util.List;

import com.service.user.entity.Message;
import com.service.user.entity.Useraccount;

/**
 * @author danielf
 *
 */
public interface UserService {

	Useraccount saveOrUpdate(Useraccount user);

	Useraccount getById(String username);

	List<Useraccount> getAll();

	void sendMessage(Message message);

}

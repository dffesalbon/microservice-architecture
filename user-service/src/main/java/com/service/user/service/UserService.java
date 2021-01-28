/**
 * 
 */
package com.service.user.service;

import java.util.List;

import com.service.user.dto.Userdata;

/**
 * @author danielf
 *
 */
public interface UserService {

	Userdata saveOrUpdate(Userdata user);

	Userdata getById(String username);

	List<Userdata> getAll();

}

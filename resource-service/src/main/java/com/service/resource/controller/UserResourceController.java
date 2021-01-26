/**
 * 
 */
package com.service.resource.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.resource.feign.UserServiceFeign;
import com.service.resource.transfer.Userdata;

/**
 * @author danielf
 *
 */
@RestController
@RequestMapping("/user")
public class UserResourceController {

	@Autowired
	private UserServiceFeign userServicefeign;

	@PostMapping("/save")
	public Userdata saveOrUpdate(@RequestBody Userdata user) {
		return userServicefeign.saveOrUpdate(user);
	}

	@GetMapping("/get/{username}")
	public Userdata getById(@PathVariable String username) {
		return userServicefeign.getById(username);
	}

	@GetMapping("/all")
	public List<Userdata> getAll() {
		return userServicefeign.getAll();
	}
}

/**
 * 
 */
package com.service.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.user.entity.Message;
import com.service.user.entity.Useraccount;
import com.service.user.service.UserService;

/**
 * @author danielf
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/save")
	public Useraccount saveOrUpdate(@RequestBody Useraccount user) {
		return userService.saveOrUpdate(user);
	}

	@GetMapping("/get/{username}")
	public Useraccount getById(@PathVariable String username) {
		return userService.getById(username);
	}

	@GetMapping("/all")
	public List<Useraccount> getAll() {
		return userService.getAll();
	}

	@PostMapping("/message/send")
	public void sendMessage(@RequestBody Message message) {
		userService.sendMessage(message);
	}

}

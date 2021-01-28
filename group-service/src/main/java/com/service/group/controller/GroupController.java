/**
 * 
 */
package com.service.group.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.group.entity.Group;
import com.service.group.service.GroupService;

/**
 * @author danielf
 *
 */
@RestController
@RequestMapping("/group")
public class GroupController {

	@Autowired
	private GroupService groupService;

	@GetMapping("/all")
	public List<Group> getAll() {
		return groupService.getAll();
	}

	@GetMapping("/get/{id}")
	public Group getGroup(@PathVariable long id) {
		return groupService.getGroup(id);
	}

}

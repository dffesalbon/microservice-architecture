/**
 * 
 */
package com.service.group.service;

import java.util.List;

import com.service.group.entity.Group;

/**
 * @author danielf
 *
 */
public interface GroupService {

	List<Group> getAll();

	Group getGroup(long id);

}

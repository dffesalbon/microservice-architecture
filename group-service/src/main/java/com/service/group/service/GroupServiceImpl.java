/**
 * 
 */
package com.service.group.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.service.group.entity.Group;

/**
 * @author danielf
 *
 */
@Service
public class GroupServiceImpl implements GroupService {

	private static final Logger LOGGER = LoggerFactory.getLogger(GroupServiceImpl.class);

	@Override
	public List<Group> getAll() {

		List<Group> list = new ArrayList<Group>();
		try {

			LOGGER.info("service called");
			for (int i = 0; i < 5; i++) {
				Group g = new Group();
				g.setGroupid(i + 1);
				g.setGroupname("Group" + (i + 1));
				list.add(g);
			}

		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.warn("Error occured! " + e);
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Group getGroup(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}

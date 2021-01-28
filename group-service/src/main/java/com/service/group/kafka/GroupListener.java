/**
 * 
 */
package com.service.group.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.service.group.service.GroupServiceImpl;

/**
 * @author danielf
 *
 */
@Service
public class GroupListener {

	private static final Logger LOGGER = LoggerFactory.getLogger(GroupListener.class);

	@KafkaListener(topics = "topic", groupId = "groupid")
	public void handle(String data) {
		LOGGER.info("message recieved: " + data);
	}

}

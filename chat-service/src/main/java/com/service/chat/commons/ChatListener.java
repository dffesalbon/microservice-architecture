package com.service.chat.commons;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import com.service.chat.entity.Message;

@Service
public class ChatListener {

	private static final Logger LOGGER = LoggerFactory.getLogger(ChatListener.class);

	@Autowired
	SimpMessagingTemplate template;

	@KafkaListener(topics = "custom-topic", groupId = "custom-group")
	public void handle(Message message) {
		LOGGER.info("message recieved: " + message);
		template.convertAndSend("/topic/group", message);
	}

}

/**
 * 
 */
package com.service.chat.service;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.service.chat.entity.Message;

/**
 * @author danielf
 *
 */
@Service
public class ChatServiceImpl implements ChatService {

	@Autowired
	private KafkaTemplate<String, Message> kafkaTemplate;

	private static final Logger LOGGER = LoggerFactory.getLogger(ChatServiceImpl.class);

	@Override
	public void sendMessage(Message message) {
		try {
			LOGGER.info("sending message: " + message.getContent() + " from " + message.getSender());
			message.setTimestamp(LocalDateTime.now().toString());
			kafkaTemplate.send("custom-topic", "custom-key", message);

		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.warn("Problem: " + e);
			// TODO: handle exception
		}
		// TODO Auto-generated method stub

	}

}

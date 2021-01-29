/**
 * 
 */
package com.service.chat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.chat.entity.Message;
import com.service.chat.service.ChatService;

/**
 * @author danielf
 *
 */
@RestController
@RequestMapping("/message")
public class ChatController {

	@Autowired
	private ChatService chatService;

	@PostMapping("/send")
	public void sendMessage(@RequestBody Message message) {
		chatService.sendMessage(message);
	}

	@MessageMapping("/sendMessage")
	@SendTo("/topic/group")
	public Message broadcastGroupMessage(@Payload Message message) {
		return message;
	}

	@MessageMapping("/newUser")
	@SendTo("/topic/group")
	public Message addUser(@Payload Message message, SimpMessageHeaderAccessor headerAccessor) {
		// Add user in web socket session
		System.out.println(message.toString());
		headerAccessor.getSessionAttributes().put("username", message.getSender());
		return message;
	}

}

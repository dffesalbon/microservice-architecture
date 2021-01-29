/**
 * 
 */
package com.service.chat.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.service.chat.service.ChatService;

/**
 * @author danielf
 *
 */
@WebMvcTest(ChatController.class)
public class ChatControllerTest {

	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private ChatService chatService;
	private ChatController chatController = new ChatController();
	private static final Logger LOGGER = LoggerFactory.getLogger(ChatController.class);

}

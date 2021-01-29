package com.service.user.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.service.user.service.UserService;

@WebMvcTest(UserController.class)
public class UserControllerTest {

	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private UserService userService;
	private UserController userController = new UserController();
	private static final Logger LOGGER = LoggerFactory.getLogger(UserControllerTest.class);

	@SuppressWarnings("unused")
	@Test
	public void getAllTest() {

		try {

			when(userController.getAll()).thenReturn(userService.getAll());
			RequestBuilder request = MockMvcRequestBuilders.get("/user/all").accept(MediaType.APPLICATION_JSON);
			MvcResult result = mockMvc.perform(request).andExpect(status().isOk())
					.andExpect(content()
							.json(userService.getAll().stream().map(Object::toString).collect(Collectors.joining(","))))
					.andReturn();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			LOGGER.warn("Problem executing getAllTest() with message " + e);
		}
	}

}

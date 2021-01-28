/**
 * 
 */
package com.service.user.commons;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.service.user.service.UserServiceImpl;

/**
 * @author danielf
 *
 */
@Service
public class ClientService {

	private static final Logger LOGGER = LoggerFactory.getLogger(ClientService.class);

	//** baseUrl will be configured based on default gateway - Need changes and improvement
	public static String getRequest(String baseUrl, String baseUri) {
		try {

			return WebClient.create(baseUrl).method(HttpMethod.GET).uri(baseUri).retrieve().bodyToMono(String.class)
					.block();

		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.warn("Problem getting request on " + baseUrl + baseUri + " with message " + e);
			// TODO: handle exception
		}
		return null;
	}

}

/**
 * 
 */
package com.service.chat.commons;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.springframework.stereotype.Component;

/**
 * @author danielf
 * @see https://stackoverflow.com/questions/43612072/error-to-serialize-message-when-sending-to-kafka-topic
 *
 */
@Component
public class Serializer {

	public static byte[] SERIALIZE(String topic, Object data) {
		try {
			ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
			ObjectOutputStream objectStream = new ObjectOutputStream(byteStream);
			objectStream.writeObject(data);
			objectStream.flush();
			objectStream.close();
			return byteStream.toByteArray();
		} catch (IOException e) {
			throw new IllegalStateException("Can't serialize object: " + data, e);
		}
	}

}
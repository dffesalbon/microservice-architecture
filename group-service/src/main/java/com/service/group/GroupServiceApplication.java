package com.service.group;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;

@EnableEurekaClient
@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@EnableKafka
public class GroupServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroupServiceApplication.class, args);
	}

}

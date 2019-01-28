package com.example.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.practice.dev.model.User;

@RestController
public class Controller {
	
	@Autowired
	KafkaTemplate<String,User> kafkaTemplate;
	private static final String TOPIC = "Kafka_Topic";
	
	@GetMapping("/{name}")
	public String post(@PathVariable("name") final String name) {
		kafkaTemplate.send(TOPIC,new User(name,"IT",120000L));
		return "Published successfully";
	}
	
	@GetMapping("/list")
	public String send() {
		return "THis works" + TOPIC;
	}

}

package com.test.springBootrabbitmq.controller;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.springBootrabbitmq.configuration.RabbitMQConfiguration;
import com.test.springBootrabbitmq.model.Message;

@RestController
public class Producer {

	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	
	@Autowired
	private DirectExchange exchange;
	
	@PostMapping("/post/A")
	public String sendA(@RequestBody Message message) {
		
		System.out.println(message.getId());
		
		System.out.println(message.getName());
		rabbitTemplate.convertAndSend(exchange.getName(), RabbitMQConfiguration.ROUTING_A, message);
		
		return "Message Sent Successfullyt";
	}
	
	@PostMapping("/post/B")
	public String sendB(@RequestBody Message message) {
		
		System.out.println(message.getId());
		
		System.out.println(message.getName());
		rabbitTemplate.convertAndSend(exchange.getName(), RabbitMQConfiguration.ROUTING_B, message);
		
		return "Message Sent Successfullyt";
	}
}

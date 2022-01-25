package com.test.springBootrabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.test.springBootrabbitmq.config.MessageConfig;
import com.test.springBootrabbitmq.dto.OrderStatus;

@Component
public class User {

	@RabbitListener(queues = MessageConfig.Queue)
	public void consumeMessageFromQueue(OrderStatus orderStatus) {
		System.out.println(" Message received  from Queue "+ orderStatus);
	}
}

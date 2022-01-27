package com.test.springBootrabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import com.test.springBootrabbitmq.configuration.RabbitMQConfiguration;
import com.test.springBootrabbitmq.model.Message;

@Component
public class Consumer {

	@RabbitListener(queues = "queueA")
	public void consumeMessageFromQueue(Message message) {
		System.out.println(" Message received  from Queue A " + message);
	}

	@RabbitListener(queues = "queueB")
	public void consumeMessageFromQueueB(Message message) {
		System.out.println(" Message received  from Queue B " + message);
	}

}

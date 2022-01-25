package com.test.springBootrabbitmq.producer;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.springBootrabbitmq.config.MessageConfig;
import com.test.springBootrabbitmq.dto.Order;
import com.test.springBootrabbitmq.dto.OrderStatus;

@RestController
@RequestMapping("/order")
public class OrderPublisher {

	@Autowired
	private RabbitTemplate template;

	@PostMapping("/{restaurentName}")
	public String bookOrder(@RequestBody Order order, @PathVariable String restaurentName) {
		order.setOrderId(UUID.randomUUID().toString());
		System.out.println(order.getOrderId()+" order id");
		System.out.println(order.getName()+" order id");
		System.out.println(order.getQty()+" order id");
		System.out.println(order.getPrice()+" order id");
		
		OrderStatus orderStatus = new OrderStatus(order, "Process",  "Order Placed Successfully in" + restaurentName);
		System.out.println(orderStatus);
		System.out.println(MessageConfig.Exchange);
		System.out.println(MessageConfig.ROUTING_KEY);
		template.convertAndSend(MessageConfig.Exchange, MessageConfig.ROUTING_KEY, orderStatus);
		return "Success";
		
	}

}

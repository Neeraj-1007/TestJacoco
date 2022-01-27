package com.test.springBootrabbitmq.configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rabbitmq.client.AMQP.Exchange;


@Configuration
public class RabbitMQConfiguration {

	public static final String ROUTING_A="ROUTING_A";
	public static final String ROUTING_B="ROUTING_B";
	
	@Bean
	Queue queueA() {
		return new Queue("queueA",false);
	}
	
	@Bean
	Queue queueB() {
		return new Queue("queueB",false);
	}
	
	@Bean
	DirectExchange exchange() {
		return new DirectExchange("exchange.direct");
	}
	
	@Bean
	Binding binding(Queue queueA,DirectExchange exchange) {
		return BindingBuilder.bind(queueA).to(exchange).with(ROUTING_A);
	}
	@Bean
	Binding bindingB(Queue queueB,DirectExchange exchange) {
		return BindingBuilder.bind(queueB).to(exchange).with(ROUTING_B);
	}
	
	@Bean
	MessageConverter messageConverter() {
		return new Jackson2JsonMessageConverter();
	}
	
	
	@Bean
	RabbitTemplate rabbitTemplate(ConnectionFactory factory) {
		RabbitTemplate rabbitTemplate =new RabbitTemplate(factory);
		rabbitTemplate.setMessageConverter(messageConverter());
		return rabbitTemplate;
	}
}

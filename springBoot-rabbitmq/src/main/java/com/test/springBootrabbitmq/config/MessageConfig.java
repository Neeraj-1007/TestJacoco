package com.test.springBootrabbitmq.config;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MessageConfig {

	
	public static final String Queue="Neeraj is in RabbitMQ Queue";
	
	public static final String Exchange="Neeraj is in RabbitMQ Exchange";
	
	public static final String ROUTING_KEY="Neeraj Routing Key";
	
	@Bean
	public Queue queue() {
		return new Queue(Queue);
	}
	
	@Bean
	public TopicExchange exchange() {
		return new TopicExchange(Exchange);
	}
	
	@Bean
	public Binding binding(Queue queue,TopicExchange exchange) {
		
		return BindingBuilder.bind(queue).to(exchange).with(ROUTING_KEY);
	}
	
	@Bean
	public MessageConverter converter() {
		return new Jackson2JsonMessageConverter();
	}
	
	@Bean
	public AmqpTemplate template(ConnectionFactory connectionFactory) {
		final RabbitTemplate rabbitTemplate=new RabbitTemplate(connectionFactory);
		rabbitTemplate.setMessageConverter(converter());
		return rabbitTemplate;
	}
	
	
}

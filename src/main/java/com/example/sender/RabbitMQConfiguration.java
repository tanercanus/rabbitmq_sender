package com.example.sender;


import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tanermappper.rabbitmq_mapper.RabbitMQConstants;

@Configuration
public class RabbitMQConfiguration {

    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(RabbitMQConstants.EXCHANGE_NAME);
    }

    @Bean
    public Queue queue() {
        return new Queue(RabbitMQConstants.DEFAULT_PARSING_QUEUE);
    }

    @Bean
    public Binding binding(/*Queue queue, TopicExchange exchange*/) {
        return BindingBuilder.bind(queue()).to(exchange()).with(RabbitMQConstants.ROUTING_KEY);
    }
}

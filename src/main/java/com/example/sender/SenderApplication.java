package com.example.sender;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@PropertySource("classpath:application.properties")
public class SenderApplication {



    public static void main(String[] args) {
        SpringApplication.run(SenderApplication.class, args);
    }



    /*@Bean
    public Jackson2JsonMessageConverter messageConverter() {
        //ObjectMapper objectMapper = new ObjectMapper();
        //return new Jackson2JsonMessageConverter(objectMapper);
        return new Jackson2JsonMessageConverter();
    }*/

    /*@Bean
    public RabbitTemplate rabbitTemplate(final ConnectionFactory connectionFactory) {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        //rabbitTemplate.setMessageConverter(messageConverter());
        return rabbitTemplate;
    }*/

}


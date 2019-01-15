package com.example.sender;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tanermappper.rabbitmq_mapper.Message1;
import tanermappper.rabbitmq_mapper.Message2;
import tanermappper.rabbitmq_mapper.MessageCore;
import tanermappper.rabbitmq_mapper.RabbitMQConstants;


import java.util.Random;


@Service
public class PracticalTypeSender {
    private final RabbitTemplate rabbitTemplate;

    public PracticalTypeSender(final RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Scheduled(fixedDelay = 3000)
    public void sendMessage2() {

        Random rn = new Random();
        int message = rn.nextInt(10) + 1;

        MessageCore messageCore = new MessageCore("created");
        messageCore.setMessageClass((new Message1(55,"ahmet")));

        rabbitTemplate.convertAndSend(RabbitMQConstants.EXCHANGE_NAME, RabbitMQConstants.ROUTING_KEY, messageCore);

        MessageCore messageCore2 = new MessageCore("created");
        messageCore2.setMessageClass((new Message2("taner")));

        rabbitTemplate.convertAndSend(RabbitMQConstants.EXCHANGE_NAME, RabbitMQConstants.ROUTING_KEY, messageCore2);

        System.out.println("2-Sent: "+"2_"+message);

    }

}

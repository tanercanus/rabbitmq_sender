package com.example.sender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

/*@Service
public class PracticalTypeListener {

    //private static final Logger log = LoggerFactory.getLogger(PracticalTypeListener.class);

    @RabbitListener(queues = SenderApplication.DEFAULT_PARSING_QUEUE)
    public void receiveMessage(final Message message) {
        System.out.println(message);

        //MessageCore messageCore = (MessageCore) message.getPayload();

        //log.info("Received message as specific class: {}", messageCore.toString());
    }


}*/

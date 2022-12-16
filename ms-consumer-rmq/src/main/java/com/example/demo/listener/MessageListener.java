package com.example.demo.listener;

import com.example.demo.dto.CustomMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static com.example.demo.constants.RMQConstants.QUEUE;

@Slf4j
@Component
public class MessageListener {

    @RabbitListener(queues = QUEUE)
    public void listener(CustomMessage message) {
        log.info("Message: {}", message);
    }
}

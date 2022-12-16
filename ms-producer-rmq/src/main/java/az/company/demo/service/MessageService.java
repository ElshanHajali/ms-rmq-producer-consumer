package az.company.demo.service;

import az.company.demo.dto.CustomMessage;
import az.company.demo.factory.MessageMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import static az.company.demo.constants.RMQConstants.EXCHANGE;
import static az.company.demo.constants.RMQConstants.ROUTING_KEY;

@Service
@RequiredArgsConstructor
public class MessageService {
    private final RabbitTemplate template;

    public void saveMessage(CustomMessage message) {
        MessageMapper.setMessageVariables(message);
        template.convertAndSend(EXCHANGE, ROUTING_KEY, message);
    }
}

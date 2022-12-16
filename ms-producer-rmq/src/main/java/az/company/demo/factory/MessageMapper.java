package az.company.demo.factory;

import az.company.demo.dto.CustomMessage;

import java.time.LocalDateTime;
import java.util.Random;

public class MessageMapper {

    public static void setMessageVariables(CustomMessage message) {
        Random random = new Random();
        long randomLong = random.nextLong();
        message.setId(randomLong < 0 ? randomLong * -1 : randomLong);

        message.setSendAt(LocalDateTime.now().toString());
    }
}

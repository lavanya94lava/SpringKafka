package com.lavanya.springkafkapractice.kafka;

import com.lavanya.springkafkapractice.DTO.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger log = LoggerFactory.getLogger(JsonKafkaProducer.class);

    @KafkaListener(topics = "kafkaguides_json", groupId = "myGroup")
    public void consume(User user){
        log.info("Message received from json kafka consumer --> {}", user);
//        log.info(String.format("Message received from json kafka consumer --> %s", user));
    }
}

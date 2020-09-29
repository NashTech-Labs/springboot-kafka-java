package com.knoldus.springbootkafkajava.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.knoldus.springbootkafkajava.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    private final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "listener", groupId = "group-id")
    public void consume(String event) throws JsonProcessingException {
        logger.info("Coming message details::  "+ event);
        ObjectMapper objectMapper = new ObjectMapper();
        User user = objectMapper.readValue(event, User.class);
        logger.info("User data consumed::  "+ user);
    }
}

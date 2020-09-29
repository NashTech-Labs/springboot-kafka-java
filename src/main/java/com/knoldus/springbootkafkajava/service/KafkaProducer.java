package com.knoldus.springbootkafkajava.service;

import com.knoldus.springbootkafkajava.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
    private final Logger logger = LoggerFactory.getLogger(KafkaProducer.class);
    @Autowired
    private final KafkaTemplate<String, Object> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;

    }

    public void publish(User user) throws Exception {
        try {
            kafkaTemplate.sendDefault(user);
            kafkaTemplate.flush();
            logger.info("User data published to Kafka");
        } catch (Exception ex) {
            logger.info( "Failed to publish User data to Kafka "+ ex);
            throw ex;
        }
    }
}

package com.knoldus.springbootkafkajava.controller;

import com.knoldus.springbootkafkajava.model.User;
import com.knoldus.springbootkafkajava.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    @Autowired
    private KafkaProducer producer;

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic() throws Exception {
        User user =  new User("User", 29);
        System.out.println("Event published   "  +  user);
        this.producer.publish(user);
    }
}
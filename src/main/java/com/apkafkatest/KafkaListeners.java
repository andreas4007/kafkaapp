package com.apkafkatest;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "aptest", groupId = "groupId")
    void Listener(String data) {
        System.out.println("Listener received: " + data);
    }
}

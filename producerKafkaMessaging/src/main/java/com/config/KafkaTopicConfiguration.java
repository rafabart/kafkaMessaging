package com.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfiguration {

    private static final String CUSTOMER_TOPIC = "output-customer";

    @Bean
    public NewTopic topicExample() {

        return TopicBuilder.name(CUSTOMER_TOPIC)
                .partitions(1)
                .replicas(1)
                .build();
    }
}

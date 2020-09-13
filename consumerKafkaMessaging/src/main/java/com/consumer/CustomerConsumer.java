package com.consumer;

import com.dto.CustomerDTO;
import com.sink.CustomerSink;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@EnableBinding(CustomerSink.class)
public class CustomerConsumer {

    private final CustomerSink customerSink;

    @StreamListener(CustomerSink.INPUT)
    public void listener(@Payload CustomerDTO customerDTO) {
        System.out.println(customerDTO);
    }
}

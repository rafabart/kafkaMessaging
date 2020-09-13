package com.producer;

import com.dto.CustomerDTO;
import com.sink.CustomerSink;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@EnableBinding(CustomerSink.class)
public class CustomerProducer {

    private final CustomerSink customerSink;

    public void send(final CustomerDTO customerDTO) {

        Message<CustomerDTO> message = MessageBuilder.withPayload(customerDTO).build();

        customerSink.outbound().send(message);
    }
}

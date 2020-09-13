package com.dto;

import com.producer.CustomerProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RunnerSendMessage implements CommandLineRunner {

    private final CustomerProducer customerProducer;

    @Override
    public void run(String... args) throws Exception {

        final CustomerDTO customerDTO = new CustomerDTO("Lisa Simpsons", 14);

        customerProducer.send(customerDTO);
    }
}

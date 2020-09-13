package com.sink;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface CustomerSink {

    String OUTPUT = "output-customer";

    @Output(OUTPUT)
    MessageChannel outbound();
}

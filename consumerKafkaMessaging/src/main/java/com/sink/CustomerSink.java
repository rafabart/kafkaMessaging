package com.sink;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface CustomerSink {

    String INPUT = "input-customer";

    @Input(INPUT)
    MessageChannel inbound();
}

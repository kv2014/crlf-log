package com.kv.me;

import ch.qos.logback.classic.pattern.MessageConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

public class MyConverter extends MessageConverter {
    public String convert(ILoggingEvent event) {
        return event.getFormattedMessage().replaceAll("(\r|\n)", "");
    }
}

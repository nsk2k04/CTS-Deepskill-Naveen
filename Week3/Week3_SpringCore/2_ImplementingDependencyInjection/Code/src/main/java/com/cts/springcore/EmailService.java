package com.cts.springcore;

public class EmailService implements MessageService {
    @Override
    public String getMessage() {
        return "Message from Email Service";
    }
}

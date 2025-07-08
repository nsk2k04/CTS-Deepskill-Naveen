package com.cts.springcore;

public class MessageSender {
    private MessageService messageService;

    // Constructor Injection
    public MessageSender(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendMessage() {
        System.out.println("Sending: " + messageService.getMessage());
    }
}
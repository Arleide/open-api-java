package com.techdevbrazil.open.api.java.model;

import java.util.List;

public class ChatRequest {

    private String model;
    List<Message> messages;

    public ChatRequest() {
    }

    public ChatRequest(String model, List<Message> messages) {
        this.model = model;
        this.messages = messages;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}

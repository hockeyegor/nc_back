package com.example.aviasales2.entity;

public class OutputMessage extends ChatMessage {

    private String time;

    public OutputMessage(final String from, final String text, final String time) {
        setFrom(from);
        setText(text);
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
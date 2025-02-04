package com.mayankch.learningspringboot.app;

import lombok.Data;

//This is a DTO class

@Data
public class EmailRequest {
    private String emailContent;
    private String tone;

    public String getEmailContent(){
        return emailContent;
    }

    public String getTone() {
        return tone;
    }
}

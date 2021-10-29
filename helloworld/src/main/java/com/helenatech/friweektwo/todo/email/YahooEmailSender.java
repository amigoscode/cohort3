package com.helenatech.friweektwo.todo.email;

public class YahooEmailSender implements EmailSender {
    @Override
    public void sendEmail(Email email) {
        System.out.println("Sending email using Yahoo");
        System.out.println(email);
    }
}

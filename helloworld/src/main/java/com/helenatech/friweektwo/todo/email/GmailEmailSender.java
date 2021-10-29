package com.helenatech.friweektwo.todo.email;

public class GmailEmailSender implements EmailSender {

    @Override
    public void sendEmail(Email email) {
        System.out.println("Sending email using Gmail");
        System.out.println(email);
    }
}

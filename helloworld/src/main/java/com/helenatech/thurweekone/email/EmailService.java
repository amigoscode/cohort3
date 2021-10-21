package com.helenatech.thurweekone.email;

public class EmailService {

    private EmailValidator emailValidator;

    public boolean sendEmail(Email email) {
        boolean valid = emailValidator.isValid(email.getRecipient());
        if (valid) {
            // send email using WhatsApp api
            return true;
        } else {
            return false;
        }
    }
}

package com.helenatech.friweektwo.todo.email;

public class EmailValidator {
    public boolean validateEmail(String email) {
        return email.contains("@");
    }
}

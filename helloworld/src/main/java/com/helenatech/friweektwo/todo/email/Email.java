package com.helenatech.friweektwo.todo.email;

import java.util.Objects;

public class Email {
    private String toEmail;
    private String body;

    public Email(String toEmail, String body) {
        this.toEmail = toEmail;
        this.body = body;
    }

    public String getToEmail() {
        return toEmail;
    }

    public void setToEmail(String toEmail) {
        this.toEmail = toEmail;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return Objects.equals(toEmail, email.toEmail) && Objects.equals(body, email.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(toEmail, body);
    }

    @Override
    public String toString() {
        return "Email{" +
                "toEmail='" + toEmail + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}

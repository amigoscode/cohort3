package com.helenatech.thurweekone.email;

import java.util.Objects;

public class Email {
    private String subject;
    private String body;
    private String recipient;

    public Email(String subject, String body, String recipient) {
        this.subject = subject;
        this.body = body;
        this.recipient = recipient;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    @Override
    public String toString() {
        return "Email{" +
                "subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                ", recipient='" + recipient + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return Objects.equals(subject, email.subject) && Objects.equals(body, email.body) && Objects.equals(recipient, email.recipient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, body, recipient);
    }
}

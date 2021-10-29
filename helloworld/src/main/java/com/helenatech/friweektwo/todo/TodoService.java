package com.helenatech.friweektwo.todo;

import com.helenatech.friweektwo.todo.email.Email;
import com.helenatech.friweektwo.todo.email.EmailSender;
import com.helenatech.friweektwo.todo.email.EmailValidator;

public class TodoService {

    private EmailSender emailSender;
    private EmailValidator emailValidator;

    public TodoService(EmailSender emailSender,
                       EmailValidator emailValidator) {
        this.emailSender = emailSender;
        this.emailValidator = emailValidator;
    }

    public void addTodo(Todo todo, TodoList todoList) {
        // TODO: check if todo is empty and other business logic
        boolean isEmailValid = emailValidator.validateEmail(
                todoList.getUser().getEmail()
        );

        if (!isEmailValid) {
            throw new IllegalArgumentException(
                    todoList.getUser().getEmail() + " is not valid"
            );
        }

        todoList.getTodos().add(todo);

        String body = String.format(
                "Hi %s, New todo[%s] added",
                todoList.getUser().getName(),
                todo.getDescription());

        emailSender.sendEmail(
                new Email(todoList.getUser().getEmail(), body)
        );
    }

}

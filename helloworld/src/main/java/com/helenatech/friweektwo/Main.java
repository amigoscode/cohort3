package com.helenatech.friweektwo;

import com.helenatech.friweektwo.todo.Todo;
import com.helenatech.friweektwo.todo.TodoList;
import com.helenatech.friweektwo.todo.TodoService;
import com.helenatech.friweektwo.todo.User;
import com.helenatech.friweektwo.todo.email.EmailValidator;
import com.helenatech.friweektwo.todo.email.GmailEmailSender;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        TodoService todoService = new TodoService(
                new GmailEmailSender(),
                new EmailValidator()
        );

        Todo todo = new Todo(
                "buy eggs",
                false);

        TodoList todoList = new TodoList(
               new User("Helena", "helena@yahoo.com"),
                new ArrayList<>(),
                false,
                null
        );

        todoService.addTodo(todo, todoList);

        todoList.getTodos().forEach(System.out::println);
    }
}

package com.helenatech.friweektwo.todo;


import com.helenatech.friweektwo.todo.email.Email;
import com.helenatech.friweektwo.todo.email.EmailSender;
import com.helenatech.friweektwo.todo.email.EmailValidator;
import com.helenatech.friweektwo.todo.email.GmailEmailSender;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.*;

class TodoServiceTest {

    private EmailSender emailSender;
    private EmailValidator emailValidator;

    private TodoService underTest;

    @BeforeEach
    void setUp() {

        emailSender = mock(EmailSender.class);
        emailValidator = mock(EmailValidator.class);

        underTest = new TodoService(
                emailSender, emailValidator
        );

        // no need to bring real implementation of email sender and email validator because they have already been tested
//        underTest = new TodoService(
//                new GmailEmailSender(),
//                new EmailValidator()
//        );
    }

    @Test
    void canSuccessfullyAddTodoAndSendEmail() {
        // given
        Todo todo = new Todo(
                "buy eggs",
                false);

        TodoList todoList = new TodoList(
                new User("Helena", "helena@yahoo.com"),
                new ArrayList<>(),
                false,
                null
        );

        when(emailValidator.validateEmail("helena@yahoo.com")).thenReturn(true);

        // when
        underTest.addTodo(todo, todoList);

        // then todo is added to todList
        assertThat(todoList.getTodos())
                .isEqualTo(List.of(new Todo("buy eggs", false)));

        assertThat(todoList.getUser())
                .isEqualTo(new User("Helena", "helena@yahoo.com"));

        assertThat(todoList.getCompletedAt()).isNull();

        assertThat(todoList.isCompleted()).isFalse();

        // also email was sent
        ArgumentCaptor<Email> emailArgumentCaptor = ArgumentCaptor.forClass(Email.class);

        verify(emailSender).sendEmail(emailArgumentCaptor.capture());

        Email emailSent = emailArgumentCaptor.getValue();

        assertThat(emailSent.getToEmail()).isEqualTo("helena@yahoo.com");
        assertThat(emailSent.getBody()).isEqualTo("Hi Helena, New todo[buy eggs] added");
    }

    @Test
    void willNotAddTodoWhenEmailIsInvalid() {
        // given
        Todo todo = new Todo(
                "buy eggs",
                false);

        TodoList todoList = new TodoList(
                new User("Helena", "helenayahoo.com"),
                new ArrayList<>(),
                false,
                null
        );

        when(emailValidator.validateEmail("helenayahoo.com")).thenReturn(false);

        // when
        assertThatThrownBy(() -> underTest.addTodo(todo, todoList))
                .hasMessage("helena@yahoo.com is not valid")
                .isInstanceOf(IllegalArgumentException.class);

        verifyNoInteractions(emailSender);
    }
}
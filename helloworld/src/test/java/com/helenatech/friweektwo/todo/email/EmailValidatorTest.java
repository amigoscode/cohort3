package com.helenatech.friweektwo.todo.email;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EmailValidatorTest {

    @Test
    void canCheckValidEmail() {
        // given
        String email = "email@gmail.com";
        // when
        EmailValidator emailValidator = new EmailValidator();
        boolean expected = emailValidator.validateEmail(email);
        // then
        assertThat(expected).isTrue();
    }

    @Test
    void canCheckInvalidEmail() {
        // given
        String email = "emailgmail.com";
        // when
        EmailValidator emailValidator = new EmailValidator();
        boolean expected = emailValidator.validateEmail(email);
        // then
        assertThat(expected).isFalse();
    }
}
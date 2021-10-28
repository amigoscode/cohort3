package com.helenatech.thurweektwo.testing;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringReverserTest {

    private StringReverser underTest;

    @BeforeEach
    void setUp() {
        underTest = new StringReverser();
    }

    @Test
    @RepeatedTest(10)
    void itCanReverseAString() {
        // given
        String input = "Yacine";
        String expected = "enicaY";

        // when
        String actual = underTest.reverse(input);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void itCanDealWithEmptyString() {
        // given
        String input = "";
        String expected = "";

        // when
        String actual = underTest.reverse(input);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void itCanDealWithNullString() {
        // given
        String input = null;

        // when
        // then
        Assertions.assertThatThrownBy(() -> underTest.reverse(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Input cannot be null");

    }
}
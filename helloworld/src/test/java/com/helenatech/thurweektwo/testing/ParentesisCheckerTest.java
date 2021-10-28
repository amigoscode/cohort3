package com.helenatech.thurweektwo.testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ParentesisCheckerTest {

    @Test
    void itShouldCheckCorrectNumberOfBrackets() {
        // given
        String input = "({})";

        // when
        ParentesisChecker checker = new ParentesisChecker();
        boolean actual = checker.check(input);

        // then
        assertThat(actual).isEqualTo(true);
    }

    @Test
    void itShouldCheckIncorrectNumberOfBrackets() {
        // given
        String input = "({)";

        // when
        ParentesisChecker checker = new ParentesisChecker();
        boolean actual = checker.check(input);

        // then
        assertThat(actual).isEqualTo(false);
    }

    @Test
    void itShouldNotWorkWithEmptyInput() {
        // given
        String input = "";

        // when
        ParentesisChecker checker = new ParentesisChecker();
        boolean actual = checker.check(input);

        // then
        assertThat(actual).isEqualTo(false);
    }

    @Test
    @Disabled
    void itShouldNotWorkWhenOneOpeningBracket() {
        // given
        String input = "[";

        // when
        ParentesisChecker checker = new ParentesisChecker();
        boolean actual = checker.check(input);

        // then
        assertThat(actual).isEqualTo(false);
    }

    @Test
    void itShouldWorkWithALongSetOfBrackets() {
        // given
        String input = "({(({{({})}}))})";

        // when
        ParentesisChecker checker = new ParentesisChecker();
        boolean actual = checker.check(input);

        // then
        assertThat(actual).isEqualTo(true);
    }

    @Test
    void itShouldNotWorkWithALongSetOfBrackets() {
        // given
        String input = "({(({{({)}}))})";

        // when
        ParentesisChecker checker = new ParentesisChecker();
        boolean actual = checker.check(input);

        // then
        assertThat(actual).isEqualTo(false);
    }

    @Test
    @Disabled
    void itShouldWorkWithAAnInputWithWhiteSpaces() {
        // given
        String input = " ";

        // when
        ParentesisChecker checker = new ParentesisChecker();
        boolean actual = checker.check(input);

        // then
        assertThat(actual).isEqualTo(false);
    }

    @Test
    @Disabled
    void itShouldWorkWhenInputIsRandomText() {
        // given
        String input = "jason";

        // when
        ParentesisChecker checker = new ParentesisChecker();
        boolean actual = checker.check(input);

        // then
        assertThat(actual).isEqualTo(false);
    }
}
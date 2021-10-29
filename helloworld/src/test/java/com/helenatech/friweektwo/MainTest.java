package com.helenatech.friweektwo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class MainTest {

    @Test
    void myFirstMock() {
//        List<String> mock = new ArrayList<>();
        List<String> mock = mock(List.class);
        verifyNoInteractions(mock);

        mock.add("hello");
        mock.add("ciao");

        verify(mock).add("hello");
        verify(mock).add("ciao");

        when(mock.get(0)).thenReturn("I dont like to be a mock");
        when(mock.get(1)).thenReturn("ah cool");

        String hello = mock.get(0);
        String foo = mock.get(1);
//
        assertThat(hello).isEqualTo("I dont like to be a mock");
        assertThat(foo).isEqualTo("ah cool");

    }
}
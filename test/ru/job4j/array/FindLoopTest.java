package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test

    public void whenArrayHas5Then0() {
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test

    public void whenArrayDoesNotContainElement() {
        int[] input = {5, 4, 3, 2};
        int value = 6;
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}
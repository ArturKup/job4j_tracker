package ru.job4j.ex;

import org.junit.Assert;
import org.junit.Test;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenTheNumberIsLessThan0() {
        Fact fact = new Fact();
        fact.calc(-1);
    }

    @Test
    public void when5Then120() {
        Fact fact = new Fact();
        int in = 5;
        int expected = 120;
        Assert.assertEquals(fact.calc(in), expected);
    }
}


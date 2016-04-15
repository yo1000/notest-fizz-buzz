package com.yo1000.notest;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void fizzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("Fizz", fizzBuzz.fizz(3));
        Assert.assertEquals("", fizzBuzz.fizz(2));
    }
    @Test
    public void dizzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("Dizz", fizzBuzz.dizz(7));
        Assert.assertEquals("", fizzBuzz.dizz(2));
    }
    @Test
    public void bizzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("Bizz", fizzBuzz.bizz(13));
        Assert.assertEquals("", fizzBuzz.bizz(2));
    }
    @Test
    public void buzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("Buzz", fizzBuzz.buzz(5));
        Assert.assertEquals("", fizzBuzz.buzz(2));
    }
    @Test
    public void duzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("Duzz", fizzBuzz.duzz(11));
        Assert.assertEquals("", fizzBuzz.duzz(2));
    }
    @Test
    public void fuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("Fuzz", fizzBuzz.fuzz(17));
        Assert.assertEquals("", fizzBuzz.fuzz(2));
    }
    @Test
    public void emptyTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("1", fizzBuzz.result("", 1));
        Assert.assertEquals("2", fizzBuzz.result("2", 1));
    }
}

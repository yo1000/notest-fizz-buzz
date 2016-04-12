package com.yo1000.notest;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void fizzTest() {
        FizzBuzz.Fizz fizz = new FizzBuzz.Fizz();
        Assert.assertEquals("Fizz", fizz.echo(-3));
        Assert.assertEquals("Fizz", fizz.echo(0));
        Assert.assertEquals("Fizz", fizz.echo(3));
        Assert.assertEquals("Fizz", fizz.echo(30));
        Assert.assertEquals("", fizz.echo(-1));
        Assert.assertEquals("", fizz.echo(2));
    }
    @Test
    public void dizzTest() {
        FizzBuzz.Dizz dizz = new FizzBuzz.Dizz();
        Assert.assertEquals("Dizz", dizz.echo(-7));
        Assert.assertEquals("Dizz", dizz.echo(0));
        Assert.assertEquals("Dizz", dizz.echo(7));
        Assert.assertEquals("Dizz", dizz.echo(70));
        Assert.assertEquals("", dizz.echo(-1));
        Assert.assertEquals("", dizz.echo(2));
    }
    @Test
    public void bizzTest() {
        FizzBuzz.Bizz bizz = new FizzBuzz.Bizz();
        Assert.assertEquals("Bizz", bizz.echo(-13));
        Assert.assertEquals("Bizz", bizz.echo(0));
        Assert.assertEquals("Bizz", bizz.echo(13));
        Assert.assertEquals("Bizz", bizz.echo(130));
        Assert.assertEquals("", bizz.echo(-1));
        Assert.assertEquals("", bizz.echo(2));
    }
    @Test
    public void buzzTest() {
        FizzBuzz.Buzz buzz = new FizzBuzz.Buzz();
        Assert.assertEquals("Buzz", buzz.echo(-5));
        Assert.assertEquals("Buzz", buzz.echo(0));
        Assert.assertEquals("Buzz", buzz.echo(5));
        Assert.assertEquals("Buzz", buzz.echo(50));
        Assert.assertEquals("", buzz.echo(-1));
        Assert.assertEquals("", buzz.echo(2));
    }
    @Test
    public void duzzTest() {
        FizzBuzz.Duzz duzz = new FizzBuzz.Duzz();
        Assert.assertEquals("Duzz", duzz.echo(-11));
        Assert.assertEquals("Duzz", duzz.echo(0));
        Assert.assertEquals("Duzz", duzz.echo(11));
        Assert.assertEquals("Duzz", duzz.echo(110));
        Assert.assertEquals("", duzz.echo(-1));
        Assert.assertEquals("", duzz.echo(2));
    }
    @Test
    public void fuzzTest() {
        FizzBuzz.Fuzz fuzz = new FizzBuzz.Fuzz();
        Assert.assertEquals("Fuzz", fuzz.echo(-17));
        Assert.assertEquals("Fuzz", fuzz.echo(0));
        Assert.assertEquals("Fuzz", fuzz.echo(17));
        Assert.assertEquals("Fuzz", fuzz.echo(170));
        Assert.assertEquals("", fuzz.echo(-1));
        Assert.assertEquals("", fuzz.echo(2));
    }
    @Test
    public void emptyTest() {
        FizzBuzz.Empty empty = new FizzBuzz.Empty();
        Assert.assertEquals("1", empty.echo("", 1));
        Assert.assertEquals("2", empty.echo("2", 1));
    }
}

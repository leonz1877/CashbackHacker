package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.*;

public class CashbackHackServiceTest {

    CashbackHackService cashbackHackService = new CashbackHackService();
    int amount;

    @Test
    public void amount900JUnit4 () {
        amount = 900;

        int expected = 100;
        int actual = cashbackHackService.remain(amount);

        Assert.assertEquals (expected,actual);

    }

    @Test
    public void amount999JUnit4 () {
        amount = 999;

        int expected = 1;
        int actual = cashbackHackService.remain(amount);

        Assert.assertEquals (expected,actual);

    }

    @Test
    public void amount1000JUnit4 () {
        amount = 1000;

        int expected = 0;
        int actual = cashbackHackService.remain(amount);

        Assert.assertEquals (expected,actual);

    }

    @Test
    public void amount1001JUnit4 () {
        amount = 1001;

        int expected = 999;
        int actual = cashbackHackService.remain(amount);

        Assert.assertEquals (expected,actual);

    }

    @Test
    public void amount1100JUnit4 () {
        amount = 1100;

        int expected = 900;
        int actual = cashbackHackService.remain(amount);

        Assert.assertEquals (expected,actual);

    }

    @Test
    public void amount900JUnitJupiter () {
        amount = 900;

        int expected = 100;
        int actual = cashbackHackService.remain(amount);

        Assertions.assertEquals (expected,actual);

    }

    @Test
    public void amount999JUnitJupiter () {
        amount = 999;

        int expected = 1;
        int actual = cashbackHackService.remain(amount);

        Assertions.assertEquals (expected,actual);

    }

    @Test
    public void amount1000JUnitJupiter () {
        amount = 1000;

        int expected = 0;
        int actual = cashbackHackService.remain(amount);

        Assertions.assertEquals (expected,actual);

    }

    @Test
    public void amount1001JUnitJupiter () {
        amount = 1001;

        int expected = 999;
        int actual = cashbackHackService.remain(amount);

        Assertions.assertEquals (expected,actual);

    }

    @Test
    public void amount1100JUnitJupiter () {
        amount = 1100;

        int expected = 900;
        int actual = cashbackHackService.remain(amount);

        Assertions.assertEquals (expected,actual);

    }

}
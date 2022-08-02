package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService cashbackHackService = new CashbackHackService();
    int amount;

    @Test
    public void amount900 () {
        amount = 900;

        int expected = 100;
        int actual = cashbackHackService.remain(amount);

        Assert.assertEquals (expected,actual);

    }

    @Test
    public void amount999 () {
        amount = 999;

        int expected = 1;
        int actual = cashbackHackService.remain(amount);

        Assert.assertEquals (expected,actual);

    }

    @Test
    public void amount1000 () {
        amount = 1000;

        int expected = 0;
        int actual = cashbackHackService.remain(amount);

        Assert.assertEquals (expected,actual);

    }

    @Test
    public void amount1001 () {
        amount = 1001;

        int expected = 999;
        int actual = cashbackHackService.remain(amount);

        Assert.assertEquals (expected,actual);

    }

    @Test
    public void amount1100 () {
        amount = 1100;

        int expected = 900;
        int actual = cashbackHackService.remain(amount);

        Assert.assertEquals (expected,actual);

    }

}
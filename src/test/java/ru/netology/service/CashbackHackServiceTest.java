package ru.netology.service;


import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    CashbackHackService cashbackHackService = new CashbackHackService();
    int amount;

    @Test
    public void amount900() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals (actual,expected);
    }

    @Test
    public void amount999() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        amount = 999;

        int actual = cashbackHackService.remain(amount);
        int expected = 1;

        assertEquals (actual,expected);
    }

    @Test
    public void amount1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals (actual,expected);
    }

    @Test
    public void amount1001() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        amount = 1001;

        int actual = cashbackHackService.remain(amount);
        int expected = 999;

        assertEquals (actual,expected);
    }

    @Test
    public void amount1100() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        amount = 1100;

        int actual = cashbackHackService.remain(amount);
        int expected = 900;

        assertEquals (actual,expected);
    }

}
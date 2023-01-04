package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldCashBackLessBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCashBackEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1_000;

        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCashBackMoreBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1_500;

        int expected = 500;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}
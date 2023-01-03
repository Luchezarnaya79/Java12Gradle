package ru.netology.service;


import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class CashbackHackServiceTest {

    @Test
    public void shouldCashBackLessBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount =900;

        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCashBackEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1_000;

        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCashBackMoreBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1_500;

        int expected = 500;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}
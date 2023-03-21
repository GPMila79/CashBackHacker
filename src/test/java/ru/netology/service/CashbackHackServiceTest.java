package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void remain() {
        int boundary = 900;
        int expected = 100;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(boundary);
        assertEquals(actual, expected);
    }
    @org.junit.Test
    public void remainNull() {
        int boundary = 1000;
        int expected = 0;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(boundary);
        assertEquals(actual, expected);
    }
}
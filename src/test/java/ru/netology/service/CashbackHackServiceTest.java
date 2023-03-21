package ru.netology.service;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {
        int boundary = 900;
        int expected = 100;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(boundary);
        assertEquals(actual, expected);

    }

}
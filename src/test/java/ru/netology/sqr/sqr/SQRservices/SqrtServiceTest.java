package ru.netology.sqr.sqr.SQRservices;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SqrtServiceTest {
    @Test
    void testDefaultLowerAndUpperBounds() {
        SQRService service = new SQRService();
        int min = 100;
        int max = 9801;
        int expected = 90;
        int actual = service.calcSqrt(min, max);
        assertEquals(actual, expected);
    }

    @Test
    void TestAboveTheUpperLimit() {
        SQRService service = new SQRService();
        int min = 9801;
        int max = 20000;
        int expected = 1;
        int actual = service.calcSqrt(min, max);
        assertEquals(actual, expected);
    }

    @Test
    void TestBelowTheLowerLimit() {
        SQRService service = new SQRService();
        int min = 0;
        int max = 100;
        int expected = 1;
        int actual = service.calcSqrt(min, max);
        assertEquals(actual, expected);
    }
}
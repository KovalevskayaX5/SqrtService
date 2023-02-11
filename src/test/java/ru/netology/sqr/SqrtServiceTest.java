package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqrtServiceTest {

    @Test
    public void borderNumberFirst() {
        SqrtService service = new SqrtService();
        int expected = 3;
        int actual = service.calcSqrt(200, 300);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void borderNumberSecond() {
        SqrtService service = new SqrtService();
        int expected = 6;
        int actual = service.calcSqrt(200, 400);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void borderNumberThird() {
        SqrtService service = new SqrtService();
        int expected = 15;
        int actual = service.calcSqrt(100, 400);
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void borderNumberForth() {
        SqrtService service = new SqrtService();
        int expected = 15;
        int actual = service.calcSqrt(400, 800);
        Assertions.assertEquals(expected, actual);

    }
}

package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqrtServiceTest {

    @Test
    public void borderNumber200_300_True() {
        SqrtService service = new SqrtService();
        int expected = 3;
        int actual = service.calcSqrt(200, 300);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void borderNumber200_400_True() {
        SqrtService service = new SqrtService();
        int expected = 6;
        int actual = service.calcSqrt(200, 400);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void borderNumber100_400_False() {
        SqrtService service = new SqrtService();
        int expected = 15;
        int actual = service.calcSqrt(100, 400);
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void borderNumber400_800_False() {
        SqrtService service = new SqrtService();
        int expected = 15;
        int actual = service.calcSqrt(400, 800);
        Assertions.assertEquals(expected, actual);

    }
}

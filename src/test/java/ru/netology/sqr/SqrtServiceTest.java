package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqrtServiceTest {

    @Test
    public void SquareCalcBorderNumber200_300() {
        SqrtService service = new SqrtService();
        int expected = 3;
        int actual = service.calcSqrt(200, 300);
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void SquareCalcBorderNumber200_400() {
        SqrtService service = new SqrtService();
        int expected = 6;
        int actual = service.calcSqrt(200, 400);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void SquareCalcBorderNumber100_400() {
        SqrtService service = new SqrtService();
        int expected = 11;
        int actual = service.calcSqrt(100, 400);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void SquareCalcBorderNumber400_800() {
        SqrtService service = new SqrtService();
        int expected = 9;
        int actual = service.calcSqrt(400, 800);
        Assertions.assertEquals(expected, actual);
    }
}


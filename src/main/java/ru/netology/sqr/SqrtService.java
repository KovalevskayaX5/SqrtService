package ru.netology.sqr;

public class SqrtService {

    public int calcSqrt(int l, int h) {
        int count = 0;
        int sqrt = 0;
        for (int i = 10; i <= 99; i++) {
            sqrt = i * i;
            if (sqrt >= l && sqrt <= h) {
                count = count + 1;
            }
        }
        return count;
    }
}
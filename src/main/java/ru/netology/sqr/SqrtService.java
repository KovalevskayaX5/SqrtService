package ru.netology.sqr;

public class SqrtService {

    public int calcSqrt(int low, int high) {
        int count = 0;
        int sqrt = 0;
        for (int i = 10; i <= 99; i++) {
            sqrt = i * i;
            if (sqrt >= low && sqrt <= high) {
                count = count + 1;
            }
        }
        return count;
    }
}
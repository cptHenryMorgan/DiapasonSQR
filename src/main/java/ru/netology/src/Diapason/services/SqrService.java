package ru.netology.src.Diapason.services;

public class SqrService {

    public int calcSqr(int start, int finish) {
        int numberOfSquares = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= start & i * i <= finish) {
                numberOfSquares++;
            }
        }
        return numberOfSquares;
    }
}
package com.codecool;

import java.util.function.Supplier;

public class Fibonacci implements Supplier<Integer> {

    private int firstNum = 0;
    private int secondNum = 1;

    public static int generateFibonacci() {

    }

    @Override
    public Integer get() {
        return null;
    } // ha nextet hívok a streamen, ő ezt a getet hívja meg minden alkalommal
}

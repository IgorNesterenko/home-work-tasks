package com.hillel.FractionNumbers;

/**
 * Created by neste on 26.03.2020.
 */
public class App {
    public static void main(String[] args) {
        FractionNumbers fractionNumbers = new FractionNumbers();

        fractionNumbers.setNumber1(10);
        fractionNumbers.setNumber2(15);
        fractionNumbers.multiplyOperation();
        System.out.println(fractionNumbers.result);

        fractionNumbers.plusOperation();
        System.out.println(fractionNumbers.result);
    }
}

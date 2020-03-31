package com.hillel.FractionNumbers;

/**
 * Created by neste on 26.03.2020.
 */
public class App {
    public static void main(String[] args) {

        FractionNumbers fn1 = new FractionNumbers(4,5);
        FractionNumbers fn2 = new FractionNumbers(5,8);

        FractionNumbers plus = FractionNumbers.plus(fn1, fn2);
        System.out.println(plus);

        FractionNumbers multiply = FractionNumbers.multiply(fn1, fn2);
        System.out.println(multiply);

        FractionNumbers minus = FractionNumbers.minus(fn1, fn2);
        System.out.println(minus);

        FractionNumbers divide = FractionNumbers.divide(fn1, fn2);
        System.out.println(divide);









    }
}

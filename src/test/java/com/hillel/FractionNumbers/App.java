package com.hillel.FractionNumbers;

/**
 * Created by neste on 26.03.2020.
 */
public class App {
    public static void main(String[] args) {

        FractionNumbers fn1 = new FractionNumbers(4,5);
        FractionNumbers fn2 = new FractionNumbers(5,8);

        FractionNumbers plus = fn1.plus(fn2);
        System.out.println(plus);

        FractionNumbers multiply = fn1.multiply(fn2);
        System.out.println(multiply);

        FractionNumbers minus = fn1.minus(fn2);
        System.out.println(minus);

        FractionNumbers divide = fn1.divide(fn2);
        System.out.println(divide);









    }
}

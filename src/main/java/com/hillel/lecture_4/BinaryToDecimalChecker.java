package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class BinaryToDecimalChecker {

    @Step
    public int fromDecimalToBinary(int value) {
        int a = 0;
        double result = 0;
        int temp;
        while (value != 0) {
            temp = value % 2;
            result = result + temp *  Math.pow(10, a);
            a++;
            value = value/2;
        }
        int res = (int)result;

        return res;
    }

    @Step
    public int fromBinaryToDecimal(int value) {
        int result = 0;
        int a = 0;
        while (value > 0) {
            if (value % 2 != 0) {result = result + (int) Math.pow(2, a);}
            a++;
            value = value/10;
        }

        return result;
    }
}

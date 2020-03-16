package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class BinaryToDecimalChecker {

    @Step
    public int fromDecimalToBinary(int value) {
        int result = 0;
        int b;

    do{
    b = value % 2;
    value = value/2;
        System.out.print(value);
    } while (value != 0);
        System.out.print(result);
        return result;
    }

    @Step
    public int fromBinaryToDecimal(int value) {

//        TODO implements result
        int result = 0;

        return result;
    }
}

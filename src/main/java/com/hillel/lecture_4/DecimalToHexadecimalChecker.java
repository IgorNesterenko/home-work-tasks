package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class DecimalToHexadecimalChecker {

    @Step
    public String fromDecimalToHexadecimal(int value) {

        String a =  Integer.toHexString(value).toUpperCase();
        return a;
    }

    @Step
    public int fromHexadecimalToDecimal(String value) {

        String digits = "0123456789ABCDEF";
        int val = 0;
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }
}

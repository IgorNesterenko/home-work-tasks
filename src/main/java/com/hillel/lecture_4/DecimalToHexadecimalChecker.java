package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class DecimalToHexadecimalChecker {

    @Step
    public String fromDecimalToHexadecimal(int value) {
        String result = "";
        while (value != 0){
            int a = value%16;
            switch (a){
                case 10: result = "A" + result;
                break;
                case 11: result = "B" + result;
                    break;
                case 12: result = "c" + result;
                    break;
                case 13: result = "D" + result;
                    break;
                case 14: result = "E" + result;
                    break;
                case 15: result = "F" + result;
                    break;
                 default: result = a + result;
            }
             value = value / 16;
        }
        return result;
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

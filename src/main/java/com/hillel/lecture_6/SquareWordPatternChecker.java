package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class SquareWordPatternChecker {


    @Step
    public String applySquareWordPattern(String word) {
        String result = word;
        for (int i = 0; i < word.length() -1 ; i++) {
            char a = word.charAt(0);
            word = word.substring(1) + a;
            result += ", " + word;
        }




        return result;
    }


}

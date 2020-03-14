package com.hillel.lecture_3;

import io.qameta.allure.Step;

import static java.lang.Math.abs;

/**
 * Created by alpa on 10/22/19
 */
public class MagnitudeChecker {

    @Step
    public String getGreatestNumberByMagnitude(double a, double b) {
//        TODO implements result
        String result = "";
        double num1 = abs(a);
        double num2 = abs(b);
        if (num1 > num2){
            result = "The number " + a + " has the greatest magnitude!";
        } else  if (num2 > num1){
            result = "The number " + b + " has the greatest magnitude!";
        } else result = "The number " + a + " and " + b + " are equals by magnitude!";

        return result;
    }
}

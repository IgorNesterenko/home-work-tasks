package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class BelongsToIntervalChecker {

    @Step
    public String checkNumberInInterval(int from, int to, int number) {

        String result = "";
        if (number >= from && number <= to )
            result = String.format("Number %s belong to interval [%s;%s]", number, from, to);
        else
            result = String.format("Number %s not belong to interval [%s;%s]", number, from, to);
        return result;
    }
}

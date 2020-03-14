package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/26/19
 */
public class ReverseStringChecker {

    @Step
    public String getReversString(String value) {

//        TODO implements result
        char[] mass =  value.toCharArray();
        char[] val = new char[value.length()];
        int j = 0;
        for(int i=value.length() -1; i>=0; i--){
            val[j] = mass[i];
            j++;
        }
        return String.valueOf(val);
    }

}

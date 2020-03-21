package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class CountWordsOfEachLengthChecker {

    @Step
    public int countNumberOfWorldWithLength(String sentence, int wordLength) {

        int result = 0;
        int count = 0;
           String[] sentensArr = sentence.split(" ");
        for (int i = 0; i < sentensArr.length ; i++) {
            if(sentensArr[i].length() == wordLength || sentensArr[i].endsWith(".") && sentensArr[i].length()-1 == wordLength)
            count++;}
        result = count;
        return  result ;
    }


}

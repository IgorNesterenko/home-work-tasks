package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class UpperLowerCaseChecker {


    @Step
    public String toUpperCase(String word) {
        String result = word.toUpperCase();
        return result;
    }

    @Step
    public String toLowerCase(String word) {
        String result = word.toLowerCase();
        return result;
    }

    @Step
    public String eachSentenceToUpperCase(String sentence) {
        String result = "";
        char[] arrSentence = sentence.toCharArray();
        arrSentence[0] = Character.toUpperCase(arrSentence[0]);
        for (int i = 1; i < arrSentence.length; i++) {
            if((arrSentence[i] == '.') && arrSentence.length >= (i+2)) {
                arrSentence[i + 2] = Character.toUpperCase(arrSentence[i + 2]);
            }
         result = new String(arrSentence);
        }

        return result;}

    @Step
    public String eachLetterToUpperCase(String sentence) {
        String result = "";
        char[] arrSentence = sentence.toCharArray();
        arrSentence[0] = Character.toUpperCase(arrSentence[0]);

        for (int i = 1; i < arrSentence.length; i++) {
           if(arrSentence[i] == ' '){
               arrSentence[i+1] = Character.toUpperCase(arrSentence[i+1]);
           }
           result =  new String(arrSentence);
        }
        return result;}
}

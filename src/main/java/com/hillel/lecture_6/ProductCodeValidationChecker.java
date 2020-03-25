package com.hillel.lecture_6;

import io.qameta.allure.Step;

import static javafx.scene.input.KeyCode.Z;

/**
 * Created by alpa on 11/2/19
 */
public class ProductCodeValidationChecker {


    @Step
    public boolean validateCode(String code) {
        boolean isValid = false;
        String[] mass = code.split(" ");
        int partTwo = Integer.parseInt(mass[1]);
        String numFromFirsPart = mass[0].toString().replaceAll("[A-Za-z]", "");
        String lettersFromFirstPart = mass[0].toString().replaceAll("[0-9]", "");
        int productOfFirstDigits = Integer.parseInt(numFromFirsPart.substring(0,2)) *
               Integer.parseInt(numFromFirsPart.substring(2,4)) *
               Integer.parseInt(numFromFirsPart.substring(4,6));

        if (lettersFromFirstPart.equals(lettersFromFirstPart.toUpperCase())
                && numFromFirsPart.length() == 6 && productOfFirstDigits == partTwo) {isValid = true;}
        return isValid;
    }
}

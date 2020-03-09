package com.hillel.lecture_3;

import io.qameta.allure.Step;

import static java.lang.Math.sqrt;

/**
 * Created by alpa on 10/22/19
 */
public class QuadraticEquationChecker {

    @Step
    public String checkQuadraticEquation(double a, double b, double c) {
//        TODO implements result
       // a x2+b x+c

//        if (a == 0) {
//            if (b == 0) {
//                return "Division by zero";
//            }//
//            double result1 = -c/b;
//            return "" + result1;
//        }
        if (a==0){
                return "The 'a' coefficient should not be zero!";
               }
        String result = "";
        double d = b * b - 4*a*c;

        if (d<0) {
            result = "No roots on the set of real numbers!";
        } else if (d==0) {
            double x = -b/(2*a);
            result = "Two real, identical roots: [x1 && x2] = " + x;
        } else {
            double x1 = (-b + sqrt(d)) / (2*a);
            double x2 = (-b - sqrt(d)) / (2*a);
            result = String.format("Discriminant: %s, x1: %s, x2: %s", d, x1, x2);
        }
        return result;
    }

}

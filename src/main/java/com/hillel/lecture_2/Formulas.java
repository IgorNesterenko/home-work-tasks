package com.hillel.lecture_2;

import io.qameta.allure.Step;

import static java.lang.Math.*;

/**
 * Created by alpa on 10/16/19
 */
public class Formulas {

    @Step
    public double calculate9Formula(double x) {
        //        TODO implement formula 9
        double result = 1.1* exp(-x) + abs(cos(sqrt(PI*x))) - 3.0/8.0;
        return result;
    }

    @Step
    public double calculate10Formula(double x) {
        //        TODO implement formula 10
        double result = 1.0/3.0 * sqrt(abs(sin(x)))*pow(exp(0.12*x), 1.0 / 3.0);
        return result;
    }

    @Step
    public double calculate11Formula(double x) {
        //        TODO implement formula 11
        double result = 2.0*PI*x- abs(sin(sqrt(10.5*x)))*1.0/(pow(pow(x,2),1.0/3.0)+1.0/7.0);
        return result;
    }

    @Step
    public double calculate12Formula(double x) {
        //        TODO implement formula 12
        double result = log(sqrt(abs(2.0-x))+1.2) * 1.0/(2.0+exp(-x)) + pow(2.0/x, 1.0/3.0);
        return result;
    }

    @Step
    public double calculate13Formula(double x) {
        //        TODO implement formula 13
        double result = pow(exp(-2+x), 1.0/5.0) * 1.0/(sqrt(pow(x, 2) + pow(x, 4) + log(abs(x-3.14))));
        return result;
    }
}

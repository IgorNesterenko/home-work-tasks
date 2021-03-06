package com.hillel.lecture_3;

import io.qameta.allure.Step;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

/**
 * Created by alpa on 10/22/19
 */
public class SquareAndCircleChecker {

    @Step
    public String checkCircleInSquare(double circleArea, double squareArea) {

//        TODO implements result
        String result = "";
       double squareSide = sqrt(squareArea);
       double sircleDiametr = 2*sqrt(circleArea/PI);
       if (squareSide > sircleDiametr) {
           System.out.println("The circle is in the square");
           result = "The circle is in the square";
       }else {
           System.out.println("The circle is not in the square");
           result = "The circle is not in the square";
       }
        return result;
    }

    @Step
    public String checkSquareInCircle(double circleArea, double squareArea) {

//        TODO implements result
        String result = "";
        double squareSide = sqrt(squareArea);
        double sircleDiametr = 2*sqrt(circleArea/PI);
        double diag = squareSide * sqrt(2);
        if (diag <= sircleDiametr) {
            System.out.println("The square is in the circle");
            result = "The square is in the circle";
        }else {
            System.out.println("The square is not in the circle");
            result = "The square is not in the circle";
        }
        return result;
    }

}

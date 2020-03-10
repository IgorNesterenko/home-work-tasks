package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class MaxMinAverageChecker {

    @Step
    public int getMaxNumber(int a, int b , int c) {

//        TODO implements result
        int result = 0;
        if (a > b){
            if(a>c){
                System.out.println("MAX is a" + a);
                result = a;}
            else if(c>a){
                    System.out.println("Max is c " + c);
                    result = c;
             } }
        else if (b>a){
            if (b>c){
                System.out.println("Max is b " + b);
                result = b;
            }
            else if(c>b){
                System.out.println("Max is c " + c);
                result =c;
            }
        } else{
            System.out.println("Numbers are equals!");
            return result;
        }
        return result;
    }

    @Step
    public int getAverageNumber(int a, int b , int c) {

//        TODO implements result
        int result = 0;
        if (a > b){
            if(b<c){
                System.out.println("Average is b" + b);
                result = b;}
            else if(c<b){
                System.out.println("Average is c " + c);
                result = c;
            } }
        else if (b > a){
            if (b < c){
                System.out.println("Average is b " + b);
                result = b;
            } else if(a < c){
                System.out.println("Average is a " + a);
                result = a;
            }
        } else{
            System.out.println("Numbers are equals!");
            return result;
        }
        return result;
    }

    @Step
    public int getMinNumber(int a, int b , int c) {

//        TODO implements result
        int result = 0;
        if (a < b){
            if(a<c){
                System.out.println("Min is a " + a);
                result = a;}
            else if(c<a){
                System.out.println("Min is c " + c);
                result = c;
            } }
        else if (b<a){
            if (b<c){
                System.out.println("Min is b " + b);
                result = b;
            }
            else if(c<b){
                System.out.println("Min is c " + c);
                result =c;
            }
        } else{
            System.out.println("Numbers are equals!");
            return result;
        }
        return result;

    }
}

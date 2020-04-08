package com.hillel.lecture_10;

/**
 * Created by neste on 07.04.2020.
 */
public abstract class Calculator {

    private double num1;
    private double num2;
    private double result;

    public abstract void result();
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double sum(){
       result =  this.num1 + this.num2;
        return result;
    }

    public double minus(){
        result = this.num1 - this.num2;
        return result;
    }

    public double multiply(){
        result = this.num1 * this.num2;
        return result;
    }

    public double division(){
        if(this.num2 == 0){
            return 0;
        } else
        result =  this.num1 / this.num2;
        return result;
    }




}

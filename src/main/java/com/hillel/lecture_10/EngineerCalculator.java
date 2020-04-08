package com.hillel.lecture_10;

/**
 * Created by neste on 08.04.2020.
 */
public class EngineerCalculator extends Calculator {

    public double sinus(){
       setResult(Math.sin(getNum1()));
        return getResult();
    }

    public double cosinus(){
        setResult(Math.cos(getNum1()));
        return getResult();
    }




    @Override
    public void result() {
        System.out.println("Result of engineer calculator is: " + getResult());
    }
}

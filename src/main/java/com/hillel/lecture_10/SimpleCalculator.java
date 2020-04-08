package com.hillel.lecture_10;

/**
 * Created by neste on 07.04.2020.
 */
public class SimpleCalculator extends Calculator {


    public double sqrt(){
     setResult(Math.sqrt(getNum1()));
     result();
     return getResult();
     }

     public double pow(int expo){
        setResult(Math.pow(getNum1(), expo));
        result();
        return getResult();
     }

     public double percent(int percent){
         setResult((getNum1() * percent) / 100);
         result();
         return getResult();
     }

    @Override
    public void result() {
        System.out.println("Result of simple calculator is: " + getResult());

    }
}

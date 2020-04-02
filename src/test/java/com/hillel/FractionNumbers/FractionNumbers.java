package com.hillel.FractionNumbers;

/**
 * Created by neste on 26.03.2020.
 */
public class FractionNumbers {
   private int numerator;
   private int denominator;

    public FractionNumbers(int numerator, int denominator) {
        if (denominator == 0){
            System.out.println("Denominator can't be 0");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator(){
       return numerator;
   }

   public int getDenominator(){
       return denominator;
   }

   public  FractionNumbers multiply(FractionNumbers num1){
       return new FractionNumbers(
    num1.getNumerator() * this.getNumerator(),
    num1.getDenominator() * this.getDenominator()
       );
   }

   public  FractionNumbers plus(FractionNumbers num1){
       return new FractionNumbers(
    num1.getNumerator() * this.getDenominator() + num1.getDenominator() * this.getNumerator(),
    num1.getDenominator() * this.getDenominator()
       );
   }

   public FractionNumbers divide(FractionNumbers num1){
       return new FractionNumbers(
   num1.getNumerator() * this.getDenominator(),
   num1.getDenominator() * this.getNumerator()
       );
   }

   public  FractionNumbers minus (FractionNumbers num1){
       return new FractionNumbers(
               num1.getNumerator() * this.getDenominator() - num1.getDenominator() * this.getNumerator(),
               num1.getDenominator() * this.getDenominator()
       );
   }

    @Override
    public String toString() {
        return "FractionNumbers{" +
                 getNumerator() + "/" +
                 getDenominator() +
                '}';
    }

}


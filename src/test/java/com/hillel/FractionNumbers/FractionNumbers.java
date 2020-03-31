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

   public static FractionNumbers multiply(FractionNumbers num1, FractionNumbers num2){
       return new FractionNumbers(
    num1.getNumerator() * num2.getNumerator(),
    num1.getDenominator() * num2.getDenominator()
       );
   }

   public static FractionNumbers plus(FractionNumbers num1, FractionNumbers num2){
       return new FractionNumbers(
    num1.getNumerator() * num2.getDenominator() + num1.getDenominator() * num2.getNumerator(),
    num1.getDenominator() * num2.getDenominator()
       );
   }

   public static FractionNumbers divide(FractionNumbers num1, FractionNumbers num2){
       return new FractionNumbers(
   num1.getNumerator() * num2.getDenominator(),
   num1.getDenominator() * num2.getNumerator()
       );
   }

   public static FractionNumbers minus (FractionNumbers num1, FractionNumbers num2){
       return new FractionNumbers(
               num1.getNumerator() * num2.getDenominator() - num1.getDenominator() * num2.getNumerator(),
               num1.getDenominator() * num2.getDenominator()
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


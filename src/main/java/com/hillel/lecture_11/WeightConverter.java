package com.hillel.lecture_11;

/**
 * Created by neste on 09.04.2020.
 */
public class WeightConverter implements Converter {

    private static final double WEIGHT_CONVERT = 2.20462;

    @Override
    public double convert(String converterName, double value) {
        double result = 0;
        switch (converterName) {
            case "kilogramsToPounds":
                result = value * WEIGHT_CONVERT;
                System.out.println("Convert " + value + " kilograms to pounds - result: " + result);
                break;
            case "poundsToKilograms":
                result = value / WEIGHT_CONVERT;
                System.out.println("Convert " + value + " pounds to kilograms - result: " + result);
                break;
            default:
                System.out.println("No case for weight converter");
        }
        return result;
    }
}
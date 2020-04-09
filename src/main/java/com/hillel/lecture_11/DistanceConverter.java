package com.hillel.lecture_11;

/**
 * Created by neste on 09.04.2020.
 */
public class DistanceConverter implements Converter {

    public static final double INCHES_METERS = 39.37;
    private static final double MILES_KILOMETERS = 1.609;

    @Override
    public double convert(String converterName, double value) {
        double result = 0;
        switch (converterName){
            case "metersToInches":
                result = value * INCHES_METERS;
                System.out.println("Convert " + value + " meters to inches - result: " + result);
                break;
            case "inchesToMeters":
                result = value / INCHES_METERS;
                System.out.println("Convert " + value + " inches to meters - result: " + result);
                break;
            case "milesToKilometres":
                result = value * MILES_KILOMETERS;
                System.out.println("Convert " + value + " miles to kilometers - result: " + result);
                break;
            case "kilometresToMiles":
                result = value / MILES_KILOMETERS;
                System.out.println("Convert " + value + " kilometers to miles - result: " + result);
                break;
            default:
                System.out.println("No case for distance converter");
        }
        return result;
    }
}

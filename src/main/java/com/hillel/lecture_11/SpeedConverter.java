package com.hillel.lecture_11;

/**
 * Created by neste on 09.04.2020.
 */
public class SpeedConverter implements Converter {

    private static final double SPEED_CONVERT = 1.60926939169617;

    @Override
    public double convert(String converterName, double value) {
        double result = 0;
        switch (converterName){
            case "speedKmToMi":
                result = value / SPEED_CONVERT;
                System.out.println("Convert " + value + " kilomiters to miles - result: " + result + " mi");
                break;
            case "speedMiToKm":
                result = value * SPEED_CONVERT;
                System.out.println("Convert " + value + " miles to kilomiters - result: " + result + " km");
                break;
            default:
                System.out.println("No case for speed converter");
        }
        return result;
    }
}

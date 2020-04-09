package com.hillel.lecture_11;

/**
 * Created by neste on 09.04.2020.
 */
public class TemperatureConverter implements Converter {
    private static final double KELVIN_CELSIUS = 273.16;
    private static final double FAHRENHEIT_CELSIUS = 32;

    @Override
    public double convert(String converterName, double value) {
        double result = 0;
        switch (converterName){
            case "celsiusToFahrenheit":
                result = (value * 1.8) + FAHRENHEIT_CELSIUS;
                System.out.println("Convert " + value + " celsius to fahrenheit - result: " + result );
                break;
            case "fahrenheitToCelsius":
                result = (value - FAHRENHEIT_CELSIUS) * 5/9;
                System.out.println("Convert " + value + " fahrenheit to celsius - result: " + result);
                break;
            case "celsiusToKelvin":
                result = value * KELVIN_CELSIUS;
                System.out.println("Convert " + value + " celsius to kelvin - result: " + result);
                break;
            default:
                System.out.println("No case for temperature converter");
        }
        return result;
}
}

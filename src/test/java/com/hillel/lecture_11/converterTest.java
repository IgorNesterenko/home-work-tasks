package com.hillel.lecture_11;

import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by neste on 09.04.2020.
 */
public class converterTest {
    DistanceConverter distanceConverter = new DistanceConverter();
    SpeedConverter speedConverter = new SpeedConverter();
    TemperatureConverter temperatureConverter = new TemperatureConverter();
    WeightConverter weightConverter = new WeightConverter();

    @Test
    public void distanceTest(){
     assertEquals(distanceConverter.convert("metersToInches", 10), 393.7);
     assertEquals(distanceConverter.convert("inchesToMeters", 100), 2.54000508001016);
     assertEquals(distanceConverter.convert("milesToKilometres", 100), 160.9);
     assertEquals(distanceConverter.convert("kilometresToMiles", 100), 62.15040397762586);

    }

    @Test
    public void speedTest(){
        assertEquals(speedConverter.convert("speedKmToMi", 100), 62.14);
        assertEquals(speedConverter.convert("speedMiToKm", 100), 160.92693916961701);
    }

    @Test
    public void temperatureTest(){
        assertEquals(temperatureConverter.convert("celsiusToFahrenheit", 20), 68.0);
        assertEquals(temperatureConverter.convert("fahrenheitToCelsius", 50), 10.0);
        assertEquals(temperatureConverter.convert("celsiusToKelvin", 10), 2731.6000000000004);
    }

    @Test
    public void weightTest(){
        assertEquals(weightConverter.convert("kilogramsToPounds", 10), 22.0462);
        assertEquals(weightConverter.convert("poundsToKilograms", 100), 45.35929094356398);
    }


}

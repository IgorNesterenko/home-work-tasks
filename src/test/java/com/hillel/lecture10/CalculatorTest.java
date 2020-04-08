package com.hillel.lecture10;

import com.hillel.lecture_10.EngineerCalculator;
import com.hillel.lecture_10.SimpleCalculator;
import org.testng.annotations.Test;
import static junit.framework.Assert.assertEquals;


/**
 * Created by neste on 07.04.2020.
 */
public class CalculatorTest {
    SimpleCalculator sc = new SimpleCalculator();
    EngineerCalculator ec = new EngineerCalculator();
    @Test
    public void calculatorTest(){
        sc.setNum1(16.0);
        sc.setNum2(6.0);
        assertEquals(sc.sum(), 22.0);
        assertEquals(sc.minus(), 10.0);
        assertEquals(sc.division(), 2.6666666666666665);
        assertEquals(sc.multiply(), 96.0);
    }

    @Test
    public void simpleCalculatorTest(){
        sc.setNum1(16.0);
        assertEquals(sc.percent(10), 1.6);
        assertEquals(sc.pow(2), 256.0);
        assertEquals(sc.sqrt(), 4.0);
    }

    @Test
    public void engineerCalculator(){
        ec.setNum1(100);
        assertEquals(ec.sinus(), -0.5063656411097588);
        assertEquals(ec.cosinus(), 0.8623188722876839);
    }

}

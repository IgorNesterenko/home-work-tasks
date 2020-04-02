package com.hillel.lecture_9;

import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by neste on 02.04.2020.
 */
public class PhoneTest {
    CellPhone mobile = new CellPhone("mobile", "vodafone", "samsung");
    Phone phone = new Phone("mobile", "vodafone", "iphone");

    @Test
    public void checkOs(){
        assertEquals(mobile.osCellPhone(mobile.getManufacturer()), "Android");
    }

    @Test
    public void callTest(){
        assertEquals(mobile.call(), "Somebody call!");
    }

    @Test
    public void downTest(){
        assertEquals(mobile.down(), "Low battery!");
    }

    @Test
    public void codeTest(){
        assertEquals(phone.phoneCode(phone.getProvider()), "+38099");
    }
}

package com.hillel.lecture_9;

/**
 * Created by neste on 04.04.2020.
 */
public class LendlinePhone extends Phone {

    public LendlinePhone(String type, String provider, String manufacturer) {
        super(type, provider, manufacturer);
    }

    public String call(){
        return "Ring my bell ring my bells";
    }

    public String down(){
        return "Put the phone to the station";
    }

    public String phoneType(String type){
        switch (type){
            case "button phone":
                return "Modern phone";
            case "disk phone":
                return "Oldschool phone";
            default:
                return "Unknown type of phone";
        }
    }

}

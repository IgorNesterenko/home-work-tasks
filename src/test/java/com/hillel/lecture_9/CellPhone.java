package com.hillel.lecture_9;

/**
 * Created by neste on 02.04.2020.
 */
public class CellPhone extends Phone {
    private String os;

    public CellPhone(String type, String provider, String manufacturer){
        super(type, provider, manufacturer);
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String call(){
        return "Somebody call!";
    }

    public String down(){
        return "Low battery!";
    }

    public String osCellPhone(String model){
        switch (model){
            case "iphone":
                return "IOS";
            case "samsung":
                return "Android";
            case "nokia":
                return "windows";
            default:
                return "Generic";
        }
    }


}

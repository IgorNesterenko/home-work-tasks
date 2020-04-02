package com.hillel.lecture_9;

import java.util.Objects;

/**
 * Created by neste on 31.03.2020.
 */
public class Phone {

    private String type;
    private String provider;
    private String manufacturer;

    public Phone(String type, String provider, String manufacturer) {
        this.type = type;
        this.provider = provider;
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String call(){
        return "Call";

    }

    public String down(){
        return "Down";
    }

    public String phoneCode(String provider){
        switch (provider){
            case "vodafone":
                return "+38099";
            case "life":
                return "+38063";
            case "kyivstar":
                return "+38067";
            default:
                return "Unknown operator";
        }
    }

    public int hashCode(){
        return Objects.hash(getProvider(), getType());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(type, phone.type) &&
                Objects.equals(provider, phone.provider) &&
                Objects.equals(manufacturer, phone.manufacturer);
    }
}

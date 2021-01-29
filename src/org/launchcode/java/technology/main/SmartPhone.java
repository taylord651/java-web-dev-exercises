package org.launchcode.java.technology.main;

import org.launchcode.java.technology.main.Computer;

public class SmartPhone extends Computer {

    private String carrier;
    private Boolean android;
    private Boolean smartphone;

    public SmartPhone(String brand, String model, String processorType, String carrier, Boolean android, Boolean smartphone) {
        super(brand, model, processorType);
        this.carrier = carrier;
        this.android = android;
        this.smartphone = smartphone;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public Boolean getAndroid() {
        return android;
    }

    public void setAndroid(Boolean android) {
        this.android = android;
    }

    public Boolean getSmartphone() {
        return smartphone;
    }

    public void setSmartphone(Boolean smartphone) {
        this.smartphone = smartphone;
    }
}

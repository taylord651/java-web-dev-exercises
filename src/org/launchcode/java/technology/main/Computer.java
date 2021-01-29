package org.launchcode.java.technology.main;

public class Computer {

    private String brand;
    private String model;
    private String processorType;

    public Computer (String brand, String model, String processorType) {
        this.brand = brand;
        this.model = model;
        this.processorType = processorType;
    }

    public String getBrand(){
        return this.brand;
    }

    public void setBrand(String aBrand) {
        this.brand = aBrand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String aModel){
        this.model = model;
    }

    public String getProcessorType(){
        return this.processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }
}

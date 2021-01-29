package org.launchcode.java.technology.main;


import org.launchcode.java.technology.main.Computer;

import java.util.Date;

public class Laptop extends Computer {

    private Double screenSize;
    private String owner;
    private Date purchaseDate;

    public Laptop(String brand, String model, String processorType, Double screenSize, String owner, Date purchaseDate) {
        super(brand, model, processorType);
        this.screenSize = screenSize;
        this.owner = owner;
        this.purchaseDate = purchaseDate;
    }

    public Double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}

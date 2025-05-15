package com.pluralsight;

public class Asset {
//shared attributes
    private String description;
    private String dateAcquired;
    private double originalCost;

    //Constructor - set up asset

    public Asset(String description, double originalCost, String dateAcquired) {
        this.description = description;
        this.originalCost = originalCost;
        this.dateAcquired = dateAcquired;
    }

    // Getters to allow other classes to read the values

    public String getDescription() {
        return description;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public double getOriginalCost() {
        return originalCost;
    }

    //method will be overridden in house and vehicle to calculate actual value
    public double getValue() {
        return originalCost; //default behavior
    }
}


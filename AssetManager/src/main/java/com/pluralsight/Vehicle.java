package com.pluralsight;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost,
                   String makeModel, int year, int odometer) {
        super(description, originalCost, dateAcquired);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public int getYear() {
        return year;
    }

    public int getOdometer() {
        return odometer;
    }

    @Override
    public double getValue() {
        int age = 2025 - year;
        double value;

        if (age <= 3) {
            value = getOriginalCost() * Math.pow(0.97, age);
        } else if (age <= 6) {
            value = getOriginalCost() * Math.pow(0.97, 3) * Math.pow(0.94, age - 3);
        } else if (age <= 10) {
            value = getOriginalCost() * Math.pow(0.97, 3) * Math.pow(0.94, 3) * Math.pow(0.92, age - 6);
        } else {
            value = 1000;
            if (odometer > 100000 && !(makeModel.contains("Honda") || makeModel.contains("Toyota"))) {
                value *= 0.75;
            }
        }

        return value;
    }
}

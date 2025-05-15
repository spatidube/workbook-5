package com.pluralsight;

public class House extends Asset {
    private String address;
    private int floors;
    private int squareFootage;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost,
                 String address, int floors, int squareFootage, int lotSize) {
        super(description, originalCost, dateAcquired);
        this.address = address;
        this.floors = floors;
        this.squareFootage = squareFootage;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public int getFloors() {
        return floors;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public int getLotSize() {
        return lotSize;
    }

    @Override
    public double getValue() {
        return getOriginalCost() * 1.1; // appreciate by 10%
    }
}

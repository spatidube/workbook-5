package com.pluralsight;

public class Vehicle {
    //shared properties
    String color;
    int numberOfPassengers;
    int cargoCapacity;
    int fuelCapacity;

    //Getters and Setters
    public Vehicle(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        this.color = color;
        this.numberOfPassengers = numberOfPassengers;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
    //lezz add a method
    public void makeSound(){
        System.out.println("Generic VEHICLE soww);
    }
}
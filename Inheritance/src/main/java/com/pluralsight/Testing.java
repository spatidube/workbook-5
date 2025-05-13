package com.pluralsight;

public class Testing {

    public static void main(String[] args) {
        //Create a moped and get some features
        Moped slowRide = new Moped();
        slowRide.setColor("Pink");
        slowRide.setFuelCapacity(5);

        //make a car and give it unique features

        Car fastCar = new Car();
        fastCar.setNumberOfPassengers(2);

        //make a semitruck and give it features
        SemiTruck bigTruck = new SemiTruck();
        bigTruck.setCargoCapacity(1000);

        //lets see what we did
        System.out.println("Moped Color: " + slowRide.getColor());
        System.out.println("Fast Car carries " + fastCar.getNumberOfPassengers() + "amount of people");
        System.out.println("The Big Truck can carry: " + bigTruck.getCargoCapacity() + "items");
    }
}

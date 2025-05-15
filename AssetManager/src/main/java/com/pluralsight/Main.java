package com.pluralsight;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Asset> myAssets = new ArrayList<>();

        // Add Houses
        myAssets.add(new House("My House", "2020-01-01", 200000,
                "123 Elm Street", 1, 2000, 4000));
        myAssets.add(new House("Vacation Home", "2018-06-01", 150000,
                "555 Beach Ave", 2, 1600, 3000));

        // Add Vehicles
        myAssets.add(new Vehicle("My Truck", "2022-01-01", 40000,
                "Ford F-150", 2021, 80000));
        myAssets.add(new Vehicle("Old Reliable", "2010-05-10", 25000,
                "Toyota Camry", 2010, 150000));

        // Display each asset
        for (Asset a : myAssets) {
            String message = a.getDescription() + " (Bought: " + a.getDateAcquired() + ")";
            message += " | Original Cost: $" + a.getOriginalCost();
            message += " | Current Value: $" + a.getValue();

            if (a instanceof House) {
                House h = (House) a;
                message += " | Address: " + h.getAddress();
            } else if (a instanceof Vehicle) {
                Vehicle v = (Vehicle) a;
                message += " | Car: " + v.getYear() + " " + v.getMakeModel();
            }

            System.out.println(message);
        }
    }
}

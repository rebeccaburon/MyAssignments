package org.example;

import org.example.ACar;

public class ElectricCar extends ACar {
    protected int batteryCapacity;
    protected int maxRange;

    public ElectricCar(String registerNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registerNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }


    int getBatteryCapacityKWh() {

        return batteryCapacity;

    }

    int getMaxRangeKm() {
        return maxRange;

    }

    //omregne watt-timer pr kilometer til km/l.
    public int getWhPrKm() {
        // ændre af kwh til wh / max range = Wh/Km
        return batteryCapacity * 1000 / maxRange;
    }

    public int getKmPrL() {
        // omregner vi wh/km til km/l
        return (int) Math.floor((getWhPrKm() / 91.25) / 100);
    }

    public int getRegistrationFee() {

        int fee = 0;

        if (getKmPrL() >= 20 && getKmPrL() <= 50) {
            fee = 330;
        } else if (getKmPrL() >= 15 && getKmPrL() <= 20) {
            fee = 1050;
        } else if (getKmPrL() >= 10 && getKmPrL() <= 15) {
            fee = 2340;
        } else if (getKmPrL() >= 5 && getKmPrL() <= 10) {
            fee = 10470;
        } else {
            fee = 10470;
        }
        return fee;

        }
    }


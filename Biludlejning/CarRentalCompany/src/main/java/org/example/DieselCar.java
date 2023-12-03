package org.example;

import org.example.AFuelCar;

public class DieselCar extends AFuelCar {

    private boolean particleFilter;

    public DieselCar(String registerNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter) {
        super(registerNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
    }




    public boolean hasParticleFilter() {
        return particleFilter;
    }

    public int getRegistrationFee() {
        int fee = 0;
        int parcticalFee = 1000;

        if (getKmPrLitre() >= 20 && getKmPrLitre() <= 50) {
            fee = 330 + 130;
        } else if (getKmPrLitre() >= 15 && getKmPrLitre() <= 20) {
            fee = 1050 + 1390;
        } else if (getKmPrLitre() >= 10 && getKmPrLitre() <= 15) {
            fee = 2340 + 1850;
        } else if (getKmPrLitre() >= 5 && getKmPrLitre() <= 10) {
            fee = 10470 + 2770;
        } else {
            fee = 10470 + 15260;
        }

        if (particleFilter) {
            return fee;
        } else {
            return fee + parcticalFee;
        }

    }

    public String getFuelType() {
        return null;
    }


    public String toString() {
        return super.toString() + "Registration Fee = "+ getRegistrationFee() + " Particle Filter = " + particleFilter+"\n";
    }

}

package org.example;

import org.example.ACar;

public abstract class AFuelCar extends ACar {
    private int kmPrLitre;

    public AFuelCar(String registerNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registerNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

   public String getFuelType ( ){
    return null;
    }

   // return how many km the car can drive on 1L
    public int getKmPrLitre(){

    return kmPrLitre;
    }

    @Override
    public String toString (){
    return super.toString() + kmPrLitre;
    }
}

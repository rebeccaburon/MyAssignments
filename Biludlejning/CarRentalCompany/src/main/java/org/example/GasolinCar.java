package org.example;

import org.example.AFuelCar;

public class GasolinCar extends AFuelCar {
    public GasolinCar(String registerNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registerNumber, make, model, numberOfDoors, kmPrLitre);
    }



    public int getRegistrationFee(){
        int fee = 0;

        if (getKmPrLitre() >= 20 && getKmPrLitre() <= 50){
            fee= 330;
        }
        else if (getKmPrLitre() >= 15 && getKmPrLitre() <=20 ){
             fee = 1050;
        }
        else if (getKmPrLitre() >= 10 && getKmPrLitre() <= 15) {
            fee = 2340;
        }
        else if (getKmPrLitre() >= 5 && getKmPrLitre() <= 10){
            fee = 10470;
        } else {
            fee = 10470;
        }
        return fee;
        }

        @Override
        public String getFuelType (){
        return null;
        }




   public String toString (){
        return super.toString() + " Registration Fee = "+ getRegistrationFee()+"\n";
        }

}

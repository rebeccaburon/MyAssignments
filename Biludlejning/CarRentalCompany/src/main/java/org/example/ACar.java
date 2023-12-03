package org.example;

public abstract class ACar implements Car {

    private String registerNumber;
    private String make;
    private String model;
    private int numberOfDoors;

    public ACar(String registerNumber, String make, String model, int numberOfDoors) {
        this.registerNumber = registerNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    public String getRegistrationNumber(){
       return registerNumber;

   }

    public String getMake(){
    return make;
    }

    public String getModel(){
    return model;
    }

    public int getNumberOfDoors(){
    return numberOfDoors;
    }

    @Override
    public String toString() {
        return "RegisterNumber ='" + registerNumber + " Make='" + make + "Model = '" + model + "Number Of Doors = " + numberOfDoors+"\n";
    }
}


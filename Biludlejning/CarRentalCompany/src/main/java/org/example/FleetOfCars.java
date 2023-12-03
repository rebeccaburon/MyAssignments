package org.example;

import org.example.Car;

import java.util.ArrayList;

public class FleetOfCars {

    ArrayList<Car> fleet = new ArrayList<>();

    void addCar(Car car) {
        fleet.add(car);
    }

    public int getTotalRegistrationFeeForFleet(){
        // get the totl sum of the regristratioinFee
        int sum= 0;
        for (int i = 0; i < fleet.size(); i++){
            sum += fleet.get(i).getRegistrationFee();
        }
        return sum;
    }
    public void addCars() {
        // en setup, som gør det pænere i main
        ElectricCar e = new ElectricCar(" ABC123 ", " Tesla ", " Model X ", 3, 400, 500);
        System.out.println(e);

        GasolinCar g = new GasolinCar(" DJ91100 ", " BMW ", " 530i ", 4, 14);
        System.out.println(g);

            DieselCar d = new DieselCar(" RP657345 ", " Mercedes ", " Q9 ", 5, 50, false);
        System.out.println(d);


        addCar(e);
        addCar(g);
        addCar(d);


        getTotalRegistrationFeeForFleet();
        System.out.println("Total Fee = " + getTotalRegistrationFeeForFleet());


    }

    @Override
   public String toString(){
        String list = fleet.toString();
        return list;
    }
}

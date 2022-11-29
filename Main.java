package org.example.cars;

import org.example.cars.engine.Diesel;
import org.example.cars.engine.Electric;
import org.example.cars.engine.LPG;

public class Main {
    public static void main(String[] args) {
        Transmission automatic = new Transmission(Transmission.TypeOfTransmission.AUTOMATIC);
        Transmission mechanic = new Transmission(Transmission.TypeOfTransmission.MECHANIC);
        Transmission robot = new Transmission(Transmission.TypeOfTransmission.ROBOT);

        Diesel diesel = new Diesel("BMW", "S3", 2016, 1.9, robot);
        Diesel diesel2 = new Diesel("BMW", "S4", 2013, 1.9, automatic);
        LPG lpg = new LPG("Audi", "TT", 2015, true, mechanic);
        Electric electric = new Electric("Tesla", "Model S", 2020, 100, automatic);

        System.out.println(diesel);
        System.out.println(diesel.hashCode());
        System.out.println(diesel.equals(diesel2));
        System.out.println(lpg);
        System.out.println(electric);

    }
}

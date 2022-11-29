package org.example.cars.engine;

import org.example.cars.Car;
import org.example.cars.Transmission;

import java.util.Objects;

public class Diesel extends Car {
    private double dieselPower;
    private Transmission transmission;


    public Diesel(String brandName, String modelName, int year, double dieselPower, Transmission transmission) {
        super(brandName, modelName, year);
        this.dieselPower = dieselPower;
        this.transmission = transmission;
    }

    public Diesel() {
    }

    public double getDieselPower() {
        return dieselPower;
    }

    public void setDieselPower(double dieselPower) {
        this.dieselPower = dieselPower;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Diesel{" +
                "dieselPower=" + dieselPower +
                ", transmission=" + transmission +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Diesel diesel = (Diesel) o;
        return Double.compare(diesel.dieselPower, dieselPower) == 0 && Objects.equals(transmission, diesel.transmission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dieselPower, transmission);
    }
}

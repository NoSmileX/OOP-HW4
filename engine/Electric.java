package org.example.cars.engine;

import org.example.cars.Car;
import org.example.cars.Transmission;

import java.util.Objects;

public class Electric extends Car {
    private int batterySize;
    private Transmission transmission;

    public Electric(String brandName, String modelName, int year, int batterySize, Transmission transmission) {
        super(brandName, modelName, year);
        this.batterySize = batterySize;
        this.transmission = transmission;
    }

    public Electric() {
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Electric{" +
                "batterySize=" + batterySize +
                ", transmission=" + transmission +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Electric electric = (Electric) o;
        return batterySize == electric.batterySize && Objects.equals(transmission, electric.transmission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batterySize, transmission);
    }
}

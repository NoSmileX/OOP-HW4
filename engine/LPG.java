package org.example.cars.engine;

import org.example.cars.Car;
import org.example.cars.Transmission;

import java.util.Objects;

public class LPG extends Car {
    private boolean registrationCertificate;
    private Transmission transmission;

    public LPG(String brandName, String modelName, int year, boolean registrationCertificate, Transmission transmission) {
        super(brandName, modelName, year);
        this.registrationCertificate = registrationCertificate;
        this.transmission = transmission;
    }

    public LPG() {
    }

    public boolean isRegistrationCertificate() {
        return registrationCertificate;
    }

    public void setRegistrationCertificate(boolean registrationCertificate) {
        this.registrationCertificate = registrationCertificate;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Gas{" +
                "registrationCertificate=" + registrationCertificate +
                ", transmission=" + transmission +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LPG LPG = (LPG) o;
        return registrationCertificate == LPG.registrationCertificate && Objects.equals(transmission, LPG.transmission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), registrationCertificate, transmission);
    }
}

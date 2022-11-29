package org.example.cars;

import java.util.Objects;

public class Transmission {
    private TypeOfTransmission transmission;

 enum TypeOfTransmission {
     AUTOMATIC, MECHANIC, ROBOT
 }

    public Transmission(TypeOfTransmission transmission) {
        this.transmission = transmission;
    }

    public Transmission() {
    }

    public TypeOfTransmission getTransmission() {
        return transmission;
    }

    public void setTransmission(TypeOfTransmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "transmission=" + transmission +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transmission that = (Transmission) o;
        return transmission == that.transmission;
    }

    @Override
    public int hashCode() {
        return Objects.hash(transmission);
    }
}

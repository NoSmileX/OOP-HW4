package org.example.cars;

import java.util.Objects;

public class Car {
    private String brandName;
    private String modelName;
    private int year;

    public Car(String brandName, String modelName, int year) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.year = year;
    }

    public Car() {
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(brandName, car.brandName) && Objects.equals(modelName, car.modelName);
    }
//Вручную
    @Override
    public int hashCode() {
        int result = 31 * Objects.hash(brandName, modelName,year);
        return result;
    }
}

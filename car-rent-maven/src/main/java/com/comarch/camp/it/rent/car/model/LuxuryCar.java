package com.comarch.camp.it.rent.car.model;

public class LuxuryCar extends Vehicle{

    public LuxuryCar(String brand, String model, int year, double price, String plate) {
        super(brand, model, year, price, plate);
    }

    @Override
    public String convertToCSVString() {
        return super.convertToCSVString();
    }

}

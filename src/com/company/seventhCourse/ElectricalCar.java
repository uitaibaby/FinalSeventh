package com.company.seventhCourse;

public class ElectricalCar extends Car implements Electrical{

    public ElectricalCar(String model, String engine) {
        super(model, engine);
    }

    @Override
    public void sound() {
        System.out.println("consume electricity");
    }
}

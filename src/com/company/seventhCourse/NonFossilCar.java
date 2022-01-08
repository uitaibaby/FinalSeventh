package com.company.seventhCourse;

public class NonFossilCar extends Car implements Electrical, Alternative{

    public NonFossilCar(String model, String engine) {
        super(model, engine);
    }

    @Override
    public void sound() {
        System.out.println(model + " consume electricity");
    }

    @Override
    public void soundOfNewEra() {
        System.out.println(model + " consume hydrogen to ride");
    }
}

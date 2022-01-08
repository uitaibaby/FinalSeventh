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

    @Override
    public String toString (){
        System.out.println(model + " is the car from future");
        return "this car from future";
    }
}

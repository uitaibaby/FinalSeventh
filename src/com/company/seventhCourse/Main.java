package com.company.seventhCourse;

public class Main {

    public static void main(String[] args) {
        FossilFuel audi = new FossilFuel("Audi TT", "benzine") {
            @Override
            public void sound() {
                System.out.println("audi burn fuel");
            }
        };
        audi.sound();

        ElectricalCar tesla = new ElectricalCar("Tesla T", "electrical");
        tesla.sound();


    }
}

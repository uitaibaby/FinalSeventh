package com.company.seventhCourse;

public class Main {

    public static void main(String[] args) {
        FossilFuel audi = new FossilFuel("Audi TT", "benzine") {
            @Override
            public void sound() {
                System.out.println("Audi burn fuel");
            }
        };
        audi.sound();

        NonFossilCar tesla = new NonFossilCar("Tesla T", "electrical");
        tesla.sound();

        NonFossilCar mirai = new NonFossilCar("Toyota Mirai", "hydrogen");
        mirai.soundOfNewEra();

        mirai.toString();
    }
}

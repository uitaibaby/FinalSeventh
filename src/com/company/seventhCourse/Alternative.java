package com.company.seventhCourse;

public interface Alternative extends Electrical{
    default void soundOfNewEra(){
        System.out.println("consume hydrogen to ride");
    }
}

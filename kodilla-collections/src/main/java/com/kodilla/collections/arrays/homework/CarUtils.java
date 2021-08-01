package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.F1;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

public class CarUtils {
    public static void describeCar(Car car){
        String name = "";
        if (car instanceof Ford)
            name = "Ford";
        if (car instanceof Opel)
            name = "Opel";
        if (car instanceof F1)
            name = "F1";
        System.out.println(name + ", speed: " + car.getSpeed());

    }
}

package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.F1;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Opel opel = new Opel(5, 7);
        cars.add(opel);
        cars.add(new Ford(10, 10));
        cars.add(new Opel(12, 11));
        cars.add(new F1(30, 30));

        cars.remove(2);
        cars.remove(opel);
        Ford ford = new Ford(10.0, 10.0);
        cars.remove(ford);                              // [3]

        System.out.println(cars.size());
        for (Car car : cars) {
//            System.out.println(car + ", speed: " + car.getSpeed());
            System.out.println(car);
            CarUtils.describeCar(car);
        }
    }
}

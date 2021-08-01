package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.F1;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {
    public static Car drawCar() {
        Random random = new Random();
        int type = random.nextInt(3);
        Car car = null;
        if (type == 0)
            car = new Ford(10, 10);
        if (type == 1)
            car = new Opel(7, 10);
        if (type == 2)
            car = new F1(15, 9);

        int howMany = random.nextInt(10);
        for (int n = 0; n < howMany; n++)
            car.increaseSpeed();

        return car;
    }

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (int n = 0; n < cars.length; n++)
            CarUtils.describeCar(cars[n]);
    }
}

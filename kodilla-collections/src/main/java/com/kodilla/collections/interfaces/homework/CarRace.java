package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(10.0, 5);
        doRace(ford);

        Opel opel = new Opel(7.0, 8);
        doRace(opel);

        F1 f1 = new F1(30, 30);
        doRace(f1);
    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}
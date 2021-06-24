package com.kodilla.inheritance.homework;

public class OperatingSystemOn extends OperatingSystem {

    @Override
    public void turnOff() {
        System.out.println("Computer is On, daddy");
    }

    public void turnOn() {
        System.out.println("MacOS system is On, mum");
    }

    public OperatingSystemOn (int productionYear) {
        super(productionYear);
    }
}
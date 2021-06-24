package com.kodilla.inheritance.homework;

public class OperatingSystemOff extends OperatingSystem {

    @Override
    public void turnOn() {
        System.out.println("Computer is Off child");
    }

    public void turnOff() {
        System.out.println("Linux computer is off");
    }

    public OperatingSystemOff(int productionYear) {
        super(productionYear);
    }
}

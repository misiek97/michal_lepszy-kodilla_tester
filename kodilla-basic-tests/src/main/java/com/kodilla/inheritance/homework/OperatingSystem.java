package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int productionYear;

    public OperatingSystem(int productionYear) {
        this.productionYear = productionYear;
    }

    public void turnOn() {
        System.out.println("Computer is turned on");
    }

    public void turnOff() {
        System.out.println("Computer is turned off");
    }

    public void displayProductionYear() {
        System.out.println("Year of production: " + productionYear);
    }
}

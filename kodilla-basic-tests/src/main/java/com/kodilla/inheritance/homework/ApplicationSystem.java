package com.kodilla.inheritance.homework;

public class ApplicationSystem {

    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2010);
        operatingSystem.turnOn();
        operatingSystem.turnOff();
        operatingSystem.displayProductionYear();

        OperatingSystemOff operatingSystemOff = new OperatingSystemOff (2114);
        operatingSystemOff.turnOn();
        operatingSystemOff.turnOff();
        operatingSystemOff.displayProductionYear();

        OperatingSystemOn operatingSystemOn = new OperatingSystemOn (6664);
        operatingSystemOn.turnOn();
        operatingSystemOn.turnOff();
        operatingSystemOn.displayProductionYear();
    }
}
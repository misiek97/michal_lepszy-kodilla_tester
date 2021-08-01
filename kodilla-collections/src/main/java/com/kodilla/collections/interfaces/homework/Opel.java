package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    private double acceleration;
    private double brake;
    private double actualSpeed;

    public Opel (double acceleration, double brake) {
        this.acceleration = acceleration;
        this.brake = brake;
    }

    @Override
    public double getSpeed() {
        return actualSpeed;
    }

    @Override
    public void increaseSpeed() {
        actualSpeed = actualSpeed + acceleration * 1;
    }

    @Override
    public void decreaseSpeed() {
        actualSpeed = actualSpeed - brake * 1;
    }
}
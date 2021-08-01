package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    private double acceleration;
    private double brake;
    private double actualSpeed;

    public Ford (double acceleration, double brake) {
        this.acceleration = acceleration;
        this.brake = brake;
    }

    @Override
    public double getSpeed() {
        return actualSpeed;
    }

    @Override
    public void increaseSpeed() {
        actualSpeed = actualSpeed + acceleration * 2;
    }

    @Override
    public void decreaseSpeed() {
        actualSpeed = actualSpeed - brake * 2;
    }
}

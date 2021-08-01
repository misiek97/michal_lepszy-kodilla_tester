package com.kodilla.collections.interfaces.homework;

public class F1 implements Car {
    private double acceleration;
    private double brake;
    private double actualSpeed;

    public F1 (double acceleration, double brake) {
        this.acceleration = acceleration;
        this.brake = brake;
    }

    @Override
    public double getSpeed() {
        return actualSpeed;
    }

    @Override
    public void increaseSpeed() {
        actualSpeed = actualSpeed + acceleration * 3;
    }

    @Override
    public void decreaseSpeed() {
        actualSpeed = actualSpeed - brake * 3;
    }
}
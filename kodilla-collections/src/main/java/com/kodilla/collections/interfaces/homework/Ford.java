package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Ford{" +
                "acceleration=" + acceleration +
                ", brake=" + brake +
                ", actualSpeed=" + actualSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ford ford = (Ford) o;
        return Double.compare(ford.acceleration, acceleration) == 0 && Double.compare(ford.brake, brake) == 0 && Double.compare(ford.actualSpeed, actualSpeed) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(acceleration, brake, actualSpeed);
    }
}

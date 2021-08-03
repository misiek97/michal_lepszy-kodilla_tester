package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "F1{" +
                "acceleration=" + acceleration +
                ", brake=" + brake +
                ", actualSpeed=" + actualSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        F1 f1 = (F1) o;
        return Double.compare(f1.acceleration, acceleration) == 0 && Double.compare(f1.brake, brake) == 0 && Double.compare(f1.actualSpeed, actualSpeed) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(acceleration, brake, actualSpeed);
    }
}
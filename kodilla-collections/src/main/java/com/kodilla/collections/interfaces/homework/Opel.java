package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Opel{" +
                "acceleration=" + acceleration +
                ", brake=" + brake +
                ", actualSpeed=" + actualSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opel opel = (Opel) o;
        return Double.compare(opel.acceleration, acceleration) == 0 && Double.compare(opel.brake, brake) == 0 && Double.compare(opel.actualSpeed, actualSpeed) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(acceleration, brake, actualSpeed);
    }
}
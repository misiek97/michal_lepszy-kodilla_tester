package com.kodilla.abstracts.homework;

public abstract class Shape {
    int a;
    int b;

    public Shape(int sideA, int sideB) {
        this.a = sideA;
        this.b = sideB;
    }

    public int calculateArea; {
        int area;
        area = a * b;
    }

    public int calculateCircumference; {
        int circumference;
        circumference = (2 * a) + (2 * b);
    }
}

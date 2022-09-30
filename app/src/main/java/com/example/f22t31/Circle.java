package com.example.f22t31;

public class Circle extends Shape {
    public static final int pi = 3;
    public int radius;
    Circle(int radius) {
        super(radius,radius);
        this.radius = radius;
    }
    public int getArea(int x, int y) {
        return pi*(radius^2);
    }
    public int getPerimeter(int x, int y) {
        return 2*pi*radius;
    }
}

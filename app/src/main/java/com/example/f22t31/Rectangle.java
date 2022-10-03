package com.example.f22t31;

public class Rectangle extends Shape {

    Rectangle(int x, int y) {
        super(x, y);
    }

    @Override
    public int getArea(int x, int y) {
        return (x*y);
    }

    @Override
    public int getPerimeter(int x, int y) {
        return (2*x + 2*y);
    }
}

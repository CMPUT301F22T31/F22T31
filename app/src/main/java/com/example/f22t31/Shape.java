package com.example.f22t31;

public abstract class Shape {
    private int x;
    private int y;
    private String color = "blue";

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }


    Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract int getArea(int x, int y);
    public abstract int getPerimeter(int x, int y);
    
}

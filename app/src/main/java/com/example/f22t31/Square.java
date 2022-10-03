package com.example.f22t31;

public class Square extends Shape{
    Square (int x, int y) {
        super(x,y);
    }
    public int getArea(int x, int y) {
        return x*y;
    }
    public int getPerimeter(int x, int y) {
        return (2*(x+y));
    }
}

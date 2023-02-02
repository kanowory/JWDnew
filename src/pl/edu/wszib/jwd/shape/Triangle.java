package pl.edu.wszib.jwd.shape;

import pl.edu.wszib.jwd.shape.Shape;

public class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (0.5 * base * height);
    }
}

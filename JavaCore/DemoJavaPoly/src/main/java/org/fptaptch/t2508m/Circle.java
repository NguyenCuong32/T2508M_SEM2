package org.fptaptch.t2508m;

public class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        return 2 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

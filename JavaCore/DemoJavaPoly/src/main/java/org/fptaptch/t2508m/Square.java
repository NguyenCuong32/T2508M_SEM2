package org.fptaptch.t2508m;

public class Square extends Shape {
    private double edge;
    public Square(double edge){
        this.edge = edge;
    }
    @Override
    public double area() {
        return Math.pow(edge, 2);
    }

    @Override
    public void draw() {
        System.out.println("Drawing square");
    }
}

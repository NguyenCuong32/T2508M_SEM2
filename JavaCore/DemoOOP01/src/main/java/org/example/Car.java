package org.example;

public class Car {
    // Khai bao thuoc tinh
    private String color;
    private String engine_model;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine_model() {
        return engine_model;
    }

    public void setEngine_model(String engine_model) {
        this.engine_model = engine_model;
    }
    // Khai bao hanh vi
    public void run(){
        System.out.println("Car is running");
    }
    public void stop(){
        System.out.println("Car is stopped");
    }
}

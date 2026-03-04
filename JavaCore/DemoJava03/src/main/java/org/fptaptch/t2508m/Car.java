package org.fptaptch.t2508m;

public class Car implements ICar ,IVehicle {
    private String color;
    private String model;
    private String manufacturer;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Car() {
        System.out.println("Car constructor no parameters");
    }

    public Car(String color, String model, String manufacturer) {
        this.color = color;
        this.model = model;
        this.manufacturer = manufacturer;
        System.out.println("Car constructor parameters "+color+" "+model+" "+manufacturer);
    }

    @Override
    public void setEnergy(double energy) {
        System.out.println("set energy "+energy);
    }

    @Override
    public void run() {
        System.out.println("Car run");
    }

    @Override
    public void stop() {
        System.out.println("Car stop");
    }
}

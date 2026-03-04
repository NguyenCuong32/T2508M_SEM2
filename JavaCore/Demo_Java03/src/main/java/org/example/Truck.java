package org.example;

public class Truck implements ICar{
    @Override
    public void run() {
        System.out.println("Truck run");
    }

    @Override
    public void stop() {
        System.out.println("Truck stop");
    }
}

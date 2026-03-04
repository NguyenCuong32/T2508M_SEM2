package org.example;

public class Container implements ICar {
    @Override
    public void run() {
        System.out.println("Container run");
    }

    @Override
    public void stop() {
        System.out.println("Container stop");
    }
}

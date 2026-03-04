package org.example;

public class ECar implements ICar{
    @Override
    public void run() {
        System.out.println("ECar run");
    }

    @Override
    public void stop() {
        System.out.println("ECar stop");
    }
}

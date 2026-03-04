package org.example;

public class Animal {
    private float weight;

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    public void eat(){
        System.out.println("Eating");
    }
    public void sound(){
        System.out.println("Sounding");
    }
}

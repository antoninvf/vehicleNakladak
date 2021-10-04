package com.company;

public class Vehicle {

    private String name;
    private int mass;
    private int maxMass;

    public Vehicle(String name, int maxMass) {
        this.name = name;
        this.maxMass = maxMass;
    }

    public void load(int loadMass) {
        if((this.mass + loadMass) >= maxMass) {
            System.out.println("[" + name + "] Loading Failed: Load exceeds Max Mass!");
        }
        else {
            mass += loadMass;
            System.out.println("[" + name + "] Loaded: " + loadMass + " potatoes");
        }
    }

    public void checkMass() {
        System.out.println("[" + name + "] Current Mass: " + mass + "/" + maxMass);
    }



}

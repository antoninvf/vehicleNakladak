package com.company;

public class Main {

    public static void main(String[] args) {
        Vehicle truck = new Vehicle("Truck1000", 48000);
        Vehicle car = new Vehicle("Old Car", 8000);

        truck.checkMass();
        car.checkMass();
        truck.load(6154);
        car.load(78);
        car.load(120);
        truck.checkMass();
        car.checkMass();


    }
}

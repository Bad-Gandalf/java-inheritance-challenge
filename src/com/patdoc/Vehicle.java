package com.patdoc;

public class Vehicle {

    private String fuel;
    private int wheels;
    private int speed;
    private String year;



    public Vehicle(String fuel) {
        this(fuel, 0);
    }

    public Vehicle(String fuel, int wheels) {
        this(fuel, wheels, 0, "Year not found");
    }

    public Vehicle(String fuel, int wheels, int speed, String year) {
        this.fuel = fuel;
        this.wheels = wheels;
        this.speed = speed;
    }
    public int getWheels() {
        return wheels;
    }

    public int getSpeed() {
        return speed;
    }

    public String getYear() {
        return year;
    }

    public String getFuel() {
        return fuel;
    }

    public void moving(int speed){
        System.out.println("The vehicle is moving at " + speed + " mph.");
    }

    public void accelerate(int number){
        this.speed += number;
        System.out.println("The vehicle's speed has increased by " + number +
                "mph. New speed is " + this.speed + "mph.");
    }

    public void decelerate(int number){
        this.speed -= number;
        System.out.println("The vehicle's speed has decreased by " + number +
                "mph. New speed is " + this.speed + "mph.");
    }

    public void stop(){
        this.speed = 0;
        System.out.println("The vehicle's has come to a stop");
    }
}

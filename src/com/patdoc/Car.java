package com.patdoc;

public class Car extends Vehicle {

    private int gear;

    public int getGear() {
        return gear;
    }

    public Car(String fuel, int speed, String year) {
        super(fuel, 4, speed, year);
    }

    @Override
    public void moving(int speed) {
        System.out.println("The car is moving at " + speed +"mph.");
        super.moving(speed);
    }
    public void changingGears(int newGear){
        this.gear = newGear;
        System.out.println("Car has been changed into gear: " + gear);
    }
}

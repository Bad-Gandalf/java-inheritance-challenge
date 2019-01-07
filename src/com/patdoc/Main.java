package com.patdoc;

public class Main {

    public static void main(String[] args) {
	Astra jimsCar = new Astra("diesel", 30000);

        System.out.println(jimsCar.getMileage());
        System.out.println(jimsCar.getSpeed());
        jimsCar.accelerate(30);
        jimsCar.decelerate(15);
        jimsCar.changingGears(6);
        System.out.println(jimsCar.getFuel());
        System.out.println(jimsCar.getManufacturer());
        System.out.println(jimsCar.getWheels());
        jimsCar.stop();
        jimsCar.accelerate(30);




    }
}

package com.patdoc;

public class Astra extends Car {
    private static String manufacturer = "Vauxhall";
    private String transmission;
    private int mileage;

    public Astra(String transmission, int mileage) {
        super("diesel", 120, "2007");

        this.transmission = transmission;
        this.mileage = mileage;
    }



    public static String getManufacturer() {
        return manufacturer;
    }



    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}

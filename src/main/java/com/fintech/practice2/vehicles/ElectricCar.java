package com.fintech.practice2.vehicles;

public class ElectricCar extends Car {
    private String batteryCapacity;

    public String getBatteryCapacity(){
        return batteryCapacity;
    }
    public void setBatteryCapacity(String batteryCapacity){
        this.batteryCapacity = batteryCapacity;
    }

    //Идиоматично через констурктор
    public ElectricCar(){
        super.setEngineType("Electric");
    }
}

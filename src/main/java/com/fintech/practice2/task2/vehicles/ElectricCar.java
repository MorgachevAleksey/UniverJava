package com.fintech.practice2.task2.vehicles;

public class ElectricCar extends Car {
    private int batteryCapacity;

    public int getBatteryCapacity(){
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity){
        this.batteryCapacity = batteryCapacity;
    }

    //Данные пробрасываются наверх в конструктор супер-класса (абстрактного) - фактически цепочка вызова конструкторов
    public ElectricCar(String model, String license, String color, String year, String ownerName, String insuranceNumber, int batteryCapacity){
        super(model, license, color, year, ownerName, insuranceNumber);
        engineType = "Electric";
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String vehicleType(){
        return "Electric Car";
    }
}

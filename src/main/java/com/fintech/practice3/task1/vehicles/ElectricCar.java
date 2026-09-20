package com.fintech.practice3.task1.vehicles;

public class ElectricCar extends Car implements ElectricVehicle{
    private int batteryCapacity;

    //Методы интерфейса реализовываются переопределением
    @Override
    public int getBatteryCapacity(){
        return this.batteryCapacity;
    }
    @Override
    public void setBatteryCapacity(int batteryCapacity){
        this.batteryCapacity = batteryCapacity;
    }

    public ElectricCar(){
        setEngineType("Electric");
    }
    //Цепочка конструкторов как в предыдущих практиках (ElcectricCar -> Car -> Vechicle)
    public ElectricCar(String model, String license, String color, int year, String ownerName, String insuranceNumber, int batteryCapacity){
        super(model, license, color, year, ownerName, insuranceNumber);
        setEngineType("Electric");
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String vehicleType() {
        return "Electric Car";
    }
}

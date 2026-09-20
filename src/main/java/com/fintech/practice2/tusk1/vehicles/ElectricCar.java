package com.fintech.practice2.tusk1.vehicles;

public class ElectricCar extends Car {
    private int batteryCapacity;

    public int getBatteryCapacity(){
        return batteryCapacity;
    }
    public void setBatteryCapacity(int batteryCapacity){
        this.batteryCapacity = batteryCapacity;
    }

    //Идиоматично задать поле материнского класса через констурктор
    //В материнском конструкторе инициализируются владелец и лицензия
    //Т.к. поле типа двигателя protected - оно доступно для изменения\инициализации в дочернем классе напрямую
    //В дочернем конструкторе емкость батареи
    public ElectricCar(String ownerName, int insuranceNumber, int batteryCapacity){
        super(ownerName, insuranceNumber);
        engineType = "Electric";
        this.batteryCapacity = batteryCapacity;
    }
}

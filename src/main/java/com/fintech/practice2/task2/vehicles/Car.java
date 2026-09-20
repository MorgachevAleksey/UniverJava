package com.fintech.practice2.task2.vehicles;

public class Car extends Vehicle {
    //Конструктор ("используйте поля и методы родительского класса" - можно вызвать конструктор по умолчанию и задать поля сеттерами или (что более идеоматично) просто написать и вызвать полный конструктор Vehicle)
    public Car(String model, String license, String color, String year, String ownerName, String insuranceNumber){
        super(model, license, color, year, ownerName, insuranceNumber);
    }

    //Реализация асбтрактного метода материнского класса (фактически переопределение)
    @Override
    public String vehicleType(){
        return "Car";
    }
}


package com.fintech.practice2.tusk2.vehicles;

public abstract class Vehicle {
    //Поля - все приватные для инкапсуляции, кроме engineType - оно protected для наследования по условию
    private String model;
    private String license;
    private String color;
    private String year;
    private String ownerName;
    private String insuranceNumber;
    protected String engineType;

    //Геттеры
    public String getModel() {
        return model;
    }
    public String getLicense() {
        return license;
    }
    public String getColor() {
        return color;
    }
    public String getYear() {
        return year;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public String getInsuranceNumber() {
        return insuranceNumber;
    }
    public String getEngineType() {
        return engineType;
    }

    //Сеттеры
    public void setModel(String model) {
        this.model = model;
    }
    public void setLicense(String license) {
        this.license = license;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    //Полный конструктор (кроме engineType т.к. он задается в конструкторе дочернего класса)
    public Vehicle(String model, String license, String color, String year, String ownerName, String insuranceNumber) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
    }

    //Метод (абстрактный, поэтому без тела) получения типа транспортного средства
    public abstract String vehicleType();

    //Переопределенный для удобства toString
    @Override
    public String toString() {
        return "Транспорт " +
                "модели " + model + '\n' +
                "с номером лицензии " + license + '\n' +
                "цвета " + color + '\n' +
                year + " года\n" +
                "владельца " + ownerName + '\n' +
                "со страховкой " + insuranceNumber + '\n' +
                "с двигателем " + engineType;
    }
}

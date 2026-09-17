package com.fintech.practice2.app;

public abstract class TestCar {
    //Поля
    String model;
    String license;
    String color;
    String year;
    String ownerName;
    String insuranceNumber;
    String engineType;

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


    //Методы
    public abstract String vehicleType();
}

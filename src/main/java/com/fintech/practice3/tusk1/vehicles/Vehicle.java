package com.fintech.practice3.tusk1.vehicles;

public abstract class Vehicle {
    private String model;
    private String license;
    private String color;
    private int year;
    private String ownerName;
    private String insuranceNumber;
    private String engineType;

    public String getModel() {
        return model;
    }
    public String getLicense() {
        return license;
    }
    public String getColor() {
        return color;
    }
    public int getYear() {
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

    public void setModel(String model) {
        this.model = model;
    }
    public void setLicense(String license) {
        this.license = license;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setYear(int year) {
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

    //Тоже самое что и в Car - сначала пустой конструктор
    public Vehicle(){

    }
    public Vehicle(String model, String license, String color, int year, String ownerName, String insuranceNumber){
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
    }

    //Методы класса
    public abstract String vehicleType();

    @Override
    public String toString(){
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

package com.fintech.practice2.vehicles;

public class Car extends Vehicle {
    private String ownerName;
    private String insuranceNumber;
    protected String engineType;

    public String getOwnerName(){
        return ownerName;
    }
    public String getInsuranceNumber(){
        return insuranceNumber;
    }
    public String getEngineType(){
        return engineType;
    }

    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }
    public  void setInsuranceNumber(String insuranceNumber){
        this.insuranceNumber = insuranceNumber;
    }
    public void setEngineType(String engineType){
        this.engineType = engineType;
    }

    //Реализация абстрактного метода материнского класса
    @Override
    public String vehicleType() {
        return "Car";
    }

    //Конструктор
    public Car(
            String model,
            String license,
            String color,
            String year,
            String ownerName,
            String insuranceNumber,
            String engineType
    ){
        super.setModel(model);
        super.setLicense(license);
        super.setColor(color);
        super.setYear(year);
        super.setOwnerName(ownerName);
        super.setInsuranceNumber(insuranceNumber);
        super.setEngineType(engineType);

    }

}


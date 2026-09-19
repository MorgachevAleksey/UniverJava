package com.fintech.practice2.tusk1.vehicles;

public class Car{
    //Поля
    private String ownerName;
    private int insuranceNumber;
    protected String engineType;

    //Геттеры
    public String getOwnerName(){
        return ownerName;
    }
    public int getInsuranceNumber(){
        return insuranceNumber;
    }
    public String getEngineType(){
        return engineType;
    }

    //Сеттеры
    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }
    public  void setInsuranceNumber(int insuranceNumber){
        this.insuranceNumber = insuranceNumber;
    }
    public void setEngineType(String engineType){
        this.engineType = engineType;
    }

    //Конструктор (инициализирует только поля владельца и лицензии) по условию
    public Car(String ownerName, int insuranceNumber){
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
    }
}


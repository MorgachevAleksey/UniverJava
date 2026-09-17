package com.fintech.practice1.tusk2;

public class Car {
    //Поля
    String model;
    String license;
    String color;
    int year;

    //Геттеры
    public String getModel(){
        return model;
    }
    public String getLicense() {
        return license;
    }
    public String getColor(){
        return model;
    }
    public int getYear(){
        return year;
    }

    //Сеттеры
    public void setModel(String model){
        this.model = model;
    }
    public void setLicense(String license){
        this.license = license;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setYear(int year){
        this.year = year;
    }

    //Конструкторы
    public Car(){

    }
    public Car(String model, String license, String color, int year){
        this.model = model;
        this.license = license;
        this. color =color;
        this.year = year;
    }
    public Car(String model, int year){
        this.model = model;
        this.year = year;
    }

    //Переопределение туСтринг
    @Override
    public String toString() {
        return "Bibika " +
                "modeli " + model + '\n' +
                year + " goda";
    }

    //Ворзраст авто
    public int age(){
        return 2026 - this.year;
    }
}

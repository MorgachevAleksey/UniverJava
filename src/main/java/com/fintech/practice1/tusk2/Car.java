package com.fintech.practice1.tusk2;

public class Car {
    //Поля
    final int CURRENT_YEAR = 2026;
    private String model;
    private String license;
    private String color;
    private int year;

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
    //Конструктор с произвольными полями (выбраны модель и год)
    public Car(String model, int year){
        this.model = model;
        this.year = year;
    }

    //Переопределение toString (идеоматичнее чем писать новый to_String())
    @Override
    public String toString() {
        return "Бибика " +
                "модели " + model + '\n' +
                "с номером лицензии " + license + '\n' +
                "цвета " + color + '\n' +
                year + " года";
    }

    //Возраст авто
    public int age(){
        return CURRENT_YEAR - this.year;
    }
}

package com.fintech.practice1.tusk2;

public class Main {
    public static void main(String[] args){
        Car car1 = new Car("Porshe", "License number", "Silver", 2000);

        System.out.println(car1); //toString не требует явного вызова
        System.out.println("Возраст машинки " + car1.age() + " лет");
    }
}

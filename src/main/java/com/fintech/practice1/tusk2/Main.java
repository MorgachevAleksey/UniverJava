package com.fintech.practice1.tusk2;

public class Main {
    public static void main(String[] args){
        Car car1 = new Car("Cadelac", 2026);
        Car car2 = new Car("Porshe", "License number", "Silver", 2000);

        System.out.println(car1.toString());
        System.out.println(car2.age());
    }
}

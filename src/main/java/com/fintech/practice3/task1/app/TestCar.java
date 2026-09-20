package com.fintech.practice3.task1.app;

import com.fintech.practice3.task1.vehicles.Car;
import com.fintech.practice3.task1.vehicles.ElectricCar;

//Тестирование по условию
public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        ElectricCar car2 = new ElectricCar();
        Car car3 = new Car("Порш", "003", "Розовый", 2010, "Полина", "003300");
        ElectricCar car4 = new ElectricCar("Каделак", "004", "White", 2022, "Алексей", "004400", 100);

        car1.setYear(2015);
        car1.setOwnerName("Алексей");
        car2.setYear(2023);
        car2.setOwnerName("Полина");

        car1.setInsuranceNumber("001");
        car2.setInsuranceNumber("002");

        car2.setBatteryCapacity(100);
        System.out.println("Емкость батареи: " + car2.getBatteryCapacity());

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
    }
}
package com.fintech.practice2.tusk2.app;

import com.fintech.practice2.tusk2.vehicles.Car;
import com.fintech.practice2.tusk2.vehicles.ElectricCar;
import com.fintech.practice2.tusk2.vehicles.Vehicle;


public class TestCar {
    public static void main(String[] args) {
        // Полиморфизм
        Vehicle car1 = new Car("Cadelac", "1234_1", "Silver", "2000", "Алексей", "1");
        Vehicle car2 = new ElectricCar("Tesla", "1234_2", "Black", "2022", "Полина", "2", 100);

        // Через родительскую ссылку работает только то, что объявлено в Vehicle
        System.out.println(car1.vehicleType());
        System.out.println(car2.vehicleType());

        car1.setColor("Pink");
        car2.setOwnerName("Полли");

        //Переопределенный вVehicle toString
        System.out.println(car1);
        System.out.println(car2);
    }
}

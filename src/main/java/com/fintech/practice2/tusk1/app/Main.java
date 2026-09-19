package com.fintech.practice2.tusk1.app;

import com.fintech.practice2.tusk1.vehicles.ElectricCar;

public class Main {
    public static void main(String[] args) {
        ElectricCar electricCar1 = new ElectricCar("Алексей", 45345, 342);

        System.out.println(electricCar1.getOwnerName());
        System.out.println(electricCar1.getInsuranceNumber());
        System.out.println(electricCar1.getEngineType());
        System.out.println(electricCar1.getBatteryCapacity());
    }
}

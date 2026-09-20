package com.fintech.practice2.task1.app;

import com.fintech.practice2.task1.vehicles.Car;
import com.fintech.practice2.task1.vehicles.ElectricCar;

public class Main {
    public static void main(String[] args) {
        ElectricCar electricCar1 = new ElectricCar("Алексей", 45345, 342);
        //Так тоже можно, но для вызова методов ElectricCar понадобиться явное приведение
        Car electricCar2 = new ElectricCar("Полина", 22, 8);
        ElectricCar electricCar2_1 = (ElectricCar) electricCar2;
        /*Такое приведение работает, но кривое (может упасть с ошибкой если electricCar2 не ElecricCar) в идеале:
        if (electricCar2 instanceof ElectricCar ec) {
            System.out.println(ec.getBatteryCapacity());
        }*/

        Car car1 = new Car("Некто", 123);

        System.out.println(electricCar1.getOwnerName());
        System.out.println(electricCar1.getInsuranceNumber());
        System.out.println(electricCar1.getEngineType());
        System.out.println(electricCar1.getBatteryCapacity());

        System.out.println(electricCar2_1.getBatteryCapacity());
        System.out.println(electricCar2_1.getEngineType());

        //Null т.к. по условию задания не инициализируется тип двигателя у Car
        System.out.println(car1.getEngineType());
    }
}

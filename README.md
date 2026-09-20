# Univer Java

Проект представляет собрание решенных практических задач по теме "Программирование на языке Java"

---
## Практика 1

1) Написать программу получающую на вход количество юаней, реализовать расчет конвертации в рубли по кросс-курсу 1 к 11.91, просклонять слово "юань", по последней цифре введеного количества

2) - Класс Car: 4 поля (model, license, color, year), 3 конструктора (полный / по умолчанию / частичный), геттеры+сеттеры на все поля, метод To_String() (я переопределил toString), метод getAge() = текущий год − year (текущий год — константа). 
   - Класс Main: создать объекты через разные конструкторы, проверить To_String() и getAge().
 
---
## Практика 2

1) Пакеты vehicles + app. Car: private ownerName, insuranceNumber + геттеры/сеттеры; protected engineType + геттеры/сеттеры. ElectricCar extends Car: поле batteryCapacity + геттеры/сеттеры, в конструкторе engineType = "Electric". Продемонстрировать инкапсуляцию и наследование.

2) Абстрактный Vehicle с общими полями (model, license, color, year, ownerName, insuranceNumber, engineType) + абстрактный vehicleType() + геттеры/сеттеры. Car extends Vehicle → vehicleType() = "Car". ElectricCar extends Car → batteryCapacity + vehicleType() = "Electric Car", engineType = "Electric". В TestCar — полиморфизм: объекты через ссылки на Vehicle, изменение через сеттеры, вывод через toString().

---
## Практика 3

1) Пакеты: vehicles (Vehicle, Car, ElectricCar, ElectricVehicle) + app (TestCar).
   Vehicle — абстрактный класс: поля model, license, color, year, ownerName, insuranceNumber, engineType, геттеры/сеттеры на все, toString(), абстрактный vehicleType().
   Car extends Vehicle: конструктор задаёт engineType = "Combustion", vehicleType() возвращает "Car", ну а у ElectricCar соответсвенно "ElectricCar".
   ElectricCar extends Car implements ElectricVehicle: поле batteryCapacity + геттер/сеттер, конструктор задаёт engineType = "Electric".
   ElectricVehicle — интерфейс с методами getBatteryCapacity() и setBatteryCapacity().
   TestCar: создать объекты Car и ElectricCar, изменить год и имя владельца, изменить страховой номер, получить ёмкость батареи, вывести оба объекта через toString().
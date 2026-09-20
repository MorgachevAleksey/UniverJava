package com.fintech.practice3.task2.bikeproject;

public class BikeDriver {
    public static void main(String[] args) {
        RoadBike bike1 = new RoadBike();
		RoadBike bike2 = new RoadBike("drop", "tourer", "semi-grip", "comfort", 14, 25, 18);		
		MountainBike bike3 = new MountainBike();
		Bike bike4 = new Bike();
		
		bike1.printDescription();
		bike2.printDescription();
		bike3.printDescription();
		bike4.printDescription();

        //Обновление высоты столба для bike1
        System.out.println(bike1.getPostHeight());
        bike1.setPostHeight("20"); //Опять же String - по условию
        System.out.println(bike1.getPostHeight());
	}
}

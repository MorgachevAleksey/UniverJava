package com.fintech.practice3.task2.bikeproject;

public class RoadBike extends Bike implements RoadParts{
    private int  tyreWidth, postHeight;
	
	public RoadBike()
	{
		this("drop", "racing", "tread less", "razor", 19, 20, 22);
	}
    public RoadBike(int postHeight)
	{
		this("drop", "racing", "tread less", "razor", 19, 20, postHeight);
	}
    public RoadBike(String handleBars, String frame, String tyres, String seatType, int numGears, int tyreWidth, int postHeight) {
		super(handleBars, frame, tyres, seatType, numGears);
		this.tyreWidth = tyreWidth;
		this.postHeight = postHeight;
	}
	
	public void printDescription() {
		super.printDescription();
		System.out.println("This Roadbike bike has " + this.tyreWidth + "mm tyres and a post height of " + this.postHeight + ".");
	}

    //Реализация методов интерфейса RoadParts
    @Override
    public int getTyreWidth() {
        return this.tyreWidth;
    }
    @Override
    public int getPostHeight() {
        return this.postHeight;
    }

    //!По условию задания аргументы сеттеров типа String - поэтому нужно приведение!
    @Override
    public void setTyreWidth(String newValue) {
        this.tyreWidth = Integer.valueOf(newValue);
    }
    @Override
    public void setPostHeight(String newValue) {
        this.postHeight = Integer.valueOf(newValue);
    }
}

package com.fintech.practice4.task1;

public class Square extends GeometricObject{
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(){
        this.side = 0;
    }
    public Square(double side){
        this.side = side;
    }
}

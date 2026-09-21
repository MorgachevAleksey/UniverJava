package com.fintech.practice4.task1;

public abstract class GeometricObject {
    private String color;
    private boolean isColored;

    public String getColor() {
        return color;
    }
    public boolean isColored() {
        return isColored;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setColored(boolean isColored) {
        this.isColored = isColored;
    }

    public GeometricObject(){

    }
    public GeometricObject(String color, boolean isColored){
        this.color = color;
        this.isColored = isColored;
    }
}
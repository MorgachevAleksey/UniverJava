package com.fintech.practice3.task2.bikeproject;

public interface MountainParts {
    String TERRAIN = "off_road";

    String getSuspension();
    String getType();

    void setSuspension(String newValue);
    void setType(String newValue);
}

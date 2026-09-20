package com.fintech.practice3.tusk2.bikeproject;

public interface MountainParts {
    String TERRAIN = "off_road";

    String getSuspension();
    String getType();

    void setSuspension(String newValue);
    void setType(String newValue);
}

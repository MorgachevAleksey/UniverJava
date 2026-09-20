package com.fintech.practice3.task2.bikeproject;

public interface RoadParts  {
    String terrain = "track_racing";

    int getTyreWidth();
    int getPostHeight();

    void setTyreWidth(String newValue);
    void setPostHeight(String newValue);
}

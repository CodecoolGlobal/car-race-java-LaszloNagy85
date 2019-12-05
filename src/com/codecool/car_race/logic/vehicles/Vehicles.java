package com.codecool.car_race.logic.vehicles;

import com.codecool.car_race.Race;

public abstract class Vehicles {
    String name;
    int speed;
    private int distanceTraveled = 0;


    public abstract void prepareForLap(Race race);

    public void moveForAnHour(){
        this.distanceTraveled += this.speed;
    };

    public String getName(){
        return this.name;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getDistanceTraveled() {
        return this.distanceTraveled;
    }
}

package com.codecool.car_race.logic.vehicles;

import com.codecool.car_race.Race;
import com.codecool.car_race.logic.Util;

public class Motorcycle extends Vehicles{
    private static int motorcycleInstances = 0;
    private Util rnd = new Util();

    public Motorcycle() {
        this.name = String.format("Motorcycle %d", motorcycleInstances);
        motorcycleInstances++;
    }

    public void prepareForLap(Race race){
        this.speed = race.raceWeather.isRaining() ? 100 - (5 + rnd.getRandomNumber(46)) : 100;
    }
}

package com.codecool.car_race.logic.vehicles;

import com.codecool.car_race.Race;
import com.codecool.car_race.logic.Util;

public class Car extends Vehicles{
    private final Util rnd = new Util();

    public Car(){
        final String[] vehicleNames = new String[] {"Vertex", "Resolve", "Prime", "Falcon", "Quicksilver", "Basilisk",
                "Eminence", "Tempest", "Mammoth", "Grit", "Aurora", "Apex", "Pinnacle",
                "Tigress", "Capital", "Behemoth", "Basilisk", "Crusader", "Inquiry", "Bullet"};
        this.name = String.format("%s %s", vehicleNames[rnd.getRandomNumber(20)], vehicleNames[rnd.getRandomNumber(20)]);
    }

    public void prepareForLap(Race race) {
        this.speed = race.isThereBrokenTruck() ? 75 : 80 + rnd.getRandomNumber(31);
    }
}


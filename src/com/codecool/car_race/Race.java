package com.codecool.car_race;

import com.codecool.car_race.logic.Weather;
import com.codecool.car_race.logic.vehicles.Vehicles;

import java.util.Arrays;
import java.util.Comparator;

public class Race {
    Vehicles[] vehicles = new Vehicles[30];

    public Weather raceWeather = new Weather();

    void simulateRace(Race race) {
        for (int i=0; i<50; i++) {
            race.raceWeather.setRain();
            for (Vehicles vehicle:vehicles) {
                vehicle.prepareForLap(race);
            }
            for (Vehicles vehicle:vehicles) {
                vehicle.moveForAnHour();
            }
        }
    }

    public boolean isThereBrokenTruck() {
        int truckIndex;
        for (truckIndex = 20; truckIndex<30; truckIndex++) {
            if (this.vehicles[truckIndex].getSpeed() == 0) {
                return true;
            }
        }
        return false;
    }

    void printRaceResults() {
        Arrays.sort(this.vehicles, Comparator.comparing(Vehicles::getDistanceTraveled).reversed());
        int counter = 1;
        for (Vehicles vehicle:this.vehicles) {
            System.out.printf("%d. %dkm %s\n", counter, vehicle.getDistanceTraveled(), vehicle.getName());
            counter++;
        }
    }
}

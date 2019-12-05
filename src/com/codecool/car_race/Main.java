package com.codecool.car_race;

import com.codecool.car_race.logic.vehicles.*;


public class Main {

    /**
     * Creates all the vehicles that will be part of this race.
     */
    private static void createVehicles(Race race) {
        for (int i=0; i<10; i++) {
            race.vehicles[i] = new Car();
        }
        for (int i=10; i<20; i++) {
            race.vehicles[i] = new Motorcycle();
        }
        for (int i=20; i<30; i++) {
            race.vehicles[i] = new Truck();

        }
    }

    /**
     * Entry point of our program. Creates one race instance and
     * uses that.
     * <p>
     *
     * @param args commandline arguments passed to the program.
     *             It is unused.
     */
    public static void main(String[] args) {
        Race race = new Race();
        createVehicles(race);
        race.simulateRace(race);
        race.printRaceResults();
    }
}

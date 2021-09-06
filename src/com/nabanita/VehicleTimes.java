package com.nabanita;

import java.io.*;

import Enums.OrbitTypes;
import Models.TimeStats;
import Models.Vehicles.Bike;
import Models.Vehicles.Car;
import Models.Vehicles.Tuktuk;

import static com.nabanita.OptimumStats.orbit1;
import static com.nabanita.OptimumStats.orbit2;
import static com.nabanita.UtilityClass.findMaxStats;

public class VehicleTimes {
    public static Tuktuk tuktuk = new Tuktuk();
    public static Bike bike = new Bike();
    public static Car car = new Car();

    public static TimeStats tuktukStats = new TimeStats();
    public static TimeStats bikeStats = new TimeStats();
    public static TimeStats carStats = new TimeStats();

    public static float timeInOrbit1;
    public static float timeInOrbit2;

    public static TimeStats calculateTimeOfTuktuk(String weather, float numOrbit1CratersForWeather, float numOrbit2CratersForWeather) {
        if(!tuktuk.weatherConditions.contains(weather)) {
            tuktukStats.time = Float.MAX_VALUE;
            tuktukStats.orbitNumber = OrbitTypes.NONE;
            return tuktukStats;
        }

        timeInOrbit1 = orbit1.distance/Math.min(tuktuk.speed, orbit1.getTrafficSpeed()) + (numOrbit1CratersForWeather * tuktuk.timePerCrater);
        timeInOrbit2 = orbit2.distance/Math.min(tuktuk.speed, orbit2.getTrafficSpeed())  + (numOrbit2CratersForWeather * tuktuk.timePerCrater);
        return findMaxStats(timeInOrbit1, timeInOrbit2);
    }
    public static TimeStats calculateTimeOfBike(String weather, float numOrbit1CratersForWeather, float numOrbit2CratersForWeather) {
        if(!bike.weatherConditions.contains(weather)) {
            bikeStats.time = Float.MAX_VALUE;
            bikeStats.orbitNumber = OrbitTypes.NONE;
            return bikeStats;
        }
        timeInOrbit1 = orbit1.distance/Math.min(bike.speed,orbit1.getTrafficSpeed())  + (numOrbit1CratersForWeather * bike.timePerCrater);
        timeInOrbit2 = orbit2.distance/Math.min(bike.speed,orbit2.getTrafficSpeed())  + (numOrbit2CratersForWeather * bike.timePerCrater);
        return findMaxStats(timeInOrbit1, timeInOrbit2);
    }

    public static TimeStats calculateTimeOfCar(String weather, float numOrbit1CratersForWeather, float numOrbit2CratersForWeather) {
        if(!car.weatherConditions.contains(weather)) {
            carStats.time = Float.MAX_VALUE;
            carStats.orbitNumber = OrbitTypes.NONE;
            return carStats;
        }
        timeInOrbit1 = orbit1.distance/Math.min(car.speed,orbit1.getTrafficSpeed())  + (numOrbit1CratersForWeather * car.timePerCrater);
        timeInOrbit2 = orbit2.distance/Math.min(car.speed,orbit2.getTrafficSpeed())  + (numOrbit2CratersForWeather * car.timePerCrater);
        return findMaxStats(timeInOrbit1, timeInOrbit2);
    }
}

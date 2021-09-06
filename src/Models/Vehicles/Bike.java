package Models.Vehicles;

import Enums.WeatherTypes;
import Models.AbstractClasses.Vehicle;

public class Bike extends Vehicle {
    public static float bikeTimePerCrater;
    public Bike()
    {
        super();
        this.timePerCrater = 2/(float)60;
        this.speed = 10;
        this.weatherConditions.add(String.valueOf(WeatherTypes.SUNNY));
        this.weatherConditions.add(String.valueOf(WeatherTypes.WINDY));
    }
}

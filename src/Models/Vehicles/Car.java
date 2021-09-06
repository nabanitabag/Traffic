package Models.Vehicles;

import Enums.WeatherTypes;
import Models.AbstractClasses.Vehicle;

public class Car extends Vehicle {
    public static float carTimePerCrater;

    public Car(){
        super();
        this.timePerCrater = 3/(float)60;
        this.speed = 20;
        this.weatherConditions.add(String.valueOf(WeatherTypes.SUNNY));
        this.weatherConditions.add(String.valueOf(WeatherTypes.RAINY));
        this.weatherConditions.add(String.valueOf(WeatherTypes.WINDY));
    }
}

package Models.Vehicles;

import Enums.WeatherTypes;
import Models.AbstractClasses.Vehicle;

public class Tuktuk extends Vehicle {
    public Tuktuk()
    {
        super();
        this.timePerCrater = 1/(float)60;
        this.speed = 12;
        this.weatherConditions.add(String.valueOf(WeatherTypes.SUNNY));
        this.weatherConditions.add(String.valueOf(WeatherTypes.RAINY));
    }
}

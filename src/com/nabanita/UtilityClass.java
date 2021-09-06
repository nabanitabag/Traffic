package com.nabanita;

import Enums.OrbitTypes;
import Enums.WeatherTypes;
import Models.TimeStats;

public class UtilityClass {
    public static TimeStats findMaxStats(float vehicleSpeedInOrbit1, float vehicleSpeedInOrbit2){
        TimeStats maxStats = new TimeStats();;
        if(vehicleSpeedInOrbit1 <= vehicleSpeedInOrbit2) {
            maxStats.time = vehicleSpeedInOrbit1;
            maxStats.orbitNumber = OrbitTypes.ONE;
        }
        else {
            maxStats.time = vehicleSpeedInOrbit2;
            maxStats.orbitNumber  = OrbitTypes.TWO;
        }
        return maxStats;
    }

    public static float calculateCratersForWeather(String weather, float numCraters){
        if(weather.equals(String.valueOf(WeatherTypes.SUNNY))) {
            return numCraters * (float) 0.8;
        }
        else if(weather.equals(String.valueOf(WeatherTypes.RAINY))) {
            return numCraters * (float) 1.2;
        }
        else {
            return numCraters;
        }
    }
}

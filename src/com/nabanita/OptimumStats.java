package com.nabanita;

import Enums.OrbitTypes;
import Enums.VehicleTypes;
import Models.Orbits.Orbit1;
import Models.Orbits.Orbit2;
import Models.TimeStats;

import static com.nabanita.UtilityClass.calculateCratersForWeather;
import static com.nabanita.VehicleTimes.*;

public class OptimumStats {

    public static Orbit1 orbit1;
    public static Orbit2 orbit2;
    public static OrbitTypes orbitNumber;
    public static float numOrbit1Craters;
    public static float numOrbit2Craters;

    public static String vehicleStats;
    public static TimeStats carStats;
    public static TimeStats bikeStats;
    public static TimeStats tuktukStats;

    public static float lowestTime;
    public static String fastestVehicle;

    public static String calculateOptimumStats(String weather, String orbit1TrafficSpeed, String orbit2TrafficSpeed) {
        orbit1 = new Orbit1(orbit1TrafficSpeed);
        orbit2 = new Orbit2(orbit2TrafficSpeed);
        orbitNumber = OrbitTypes.NONE;

        numOrbit1Craters = calculateCratersForWeather(weather, orbit1.numOfOriginalCraters);
        numOrbit2Craters = calculateCratersForWeather(weather, orbit2.numOfOriginalCraters);

        lowestTime = Integer.MAX_VALUE;
        fastestVehicle = String.valueOf(VehicleTypes.BIKE);

        carStats = calculateTimeOfCar(weather,numOrbit1Craters, numOrbit2Craters);
        bikeStats = calculateTimeOfBike(weather, numOrbit1Craters, numOrbit2Craters);
        tuktukStats = calculateTimeOfTuktuk(weather, numOrbit1Craters, numOrbit2Craters);

        if( (carStats.time == bikeStats.time )&&(bikeStats.time  == tuktukStats.time ) ||
                (bikeStats.time  == tuktukStats.time )&&(bikeStats.time < carStats.time ) ||
                (bikeStats.time  == carStats.time )&&(bikeStats.time  < tuktukStats.time )
          )
        {
            fastestVehicle = String.valueOf(VehicleTypes.BIKE);
            orbitNumber= bikeStats.orbitNumber;
        }
        else if ((tuktukStats.time == carStats.time)&&(carStats.time < bikeStats.time)){
            fastestVehicle = String.valueOf(VehicleTypes.TUKTUK);
            orbitNumber= tuktukStats.orbitNumber;
        }
        else {
            if(carStats.time<=lowestTime){
                lowestTime = carStats.time;
                orbitNumber = carStats.orbitNumber;
                fastestVehicle = String.valueOf(VehicleTypes.CAR);
            }
            if(tuktukStats.time<=lowestTime){
                lowestTime = tuktukStats.time;
                orbitNumber = tuktukStats.orbitNumber;
                fastestVehicle = String.valueOf(VehicleTypes.TUKTUK);
            }
            if(bikeStats.time<=lowestTime){
                orbitNumber = bikeStats.orbitNumber;
                fastestVehicle = String.valueOf(VehicleTypes.BIKE);
            }
        }

        vehicleStats =  fastestVehicle;
        if(orbitNumber == OrbitTypes.ONE) {
            vehicleStats = vehicleStats + " ORBIT1";
        }
        else if(orbitNumber == OrbitTypes.TWO) {
            vehicleStats = vehicleStats + " ORBIT2";
        }
        return vehicleStats;
    }
}


package Models.Orbits;

import Models.AbstractClasses.Orbit;

public class Orbit1 extends Orbit {

    public Orbit1(String trafficSpeedString){
        super();
        this.distance = 18;
        this.numOfOriginalCraters = 20;
        try {
            this.trafficSpeed = Float.valueOf(trafficSpeedString);
        } catch (NumberFormatException nfe) {
            System.out.println(trafficSpeedString + " is not a number");
        }
    }

    public float getNumOfOriginalCraters(){
        return this.numOfOriginalCraters;
    }
    public void setNumOfOriginalCraters(float numOfOriginalCraters){
        this.numOfOriginalCraters = numOfOriginalCraters;
    }
    public float getDistance() {
        return distance;
    }
    public void setDistance(float distance) {
        this.distance = distance;
    }

    public float getTrafficSpeed() {
        return this.trafficSpeed;
    }
    public void setTrafficSpeed(float trafficSpeed) {
        this.trafficSpeed = trafficSpeed;
    }
}

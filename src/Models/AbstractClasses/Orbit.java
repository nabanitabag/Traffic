package Models.AbstractClasses;

public abstract class Orbit {
    public float numOfOriginalCraters;
    public float distance;
    public float trafficSpeed;

    public abstract float getDistance();
    public abstract void setDistance(float distance);

    public abstract float getTrafficSpeed();
    public abstract void setTrafficSpeed(float trafficSpeed);

    public abstract float getNumOfOriginalCraters();
    public abstract void setNumOfOriginalCraters(float numOfOriginalCraters);
}

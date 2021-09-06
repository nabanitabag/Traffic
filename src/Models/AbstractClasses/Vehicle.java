package Models.AbstractClasses;

import java.util.HashSet;
import java.util.Set;

public abstract class Vehicle {
    public float speed;
    public float timePerCrater;
    public Set<String> weatherConditions = new HashSet<String>();
}

package org.bootcamp;

public class Measure {
    private final double value;

    public Measure(double value) {
        this.value = value;
    }

    public boolean isEqual(Measure other){
        return this.value == other.value;
    }

    public boolean isSame(Measure other){
        return this.equals(other);
    }
}

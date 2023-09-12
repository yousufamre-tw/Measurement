package org.bootcamp;

import java.util.Objects;

public class Comparator {
    private final double length;

    public Comparator(double length) {
        this.length = length;
    }

    public boolean isEqual(Comparator other){
        return this.length == other.length;
    }

    public boolean isSame(Comparator other){
        return this.equals(other);
    }
}

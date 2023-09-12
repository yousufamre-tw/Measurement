package org.bootcamp;

public enum Unit {
    METER("meter", 1.0),
    CENTIMETER("centimeter", 0.01);

    private final String unitName;
    private final double conversionFactor;

    Unit(String unitName, double conversionFactor) {
        this.unitName = unitName;
        this.conversionFactor = conversionFactor;
    }

    public double getConversionFactor() {
        return conversionFactor;
    }
}


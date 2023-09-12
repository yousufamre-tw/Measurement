package org.bootcamp;

public class Length {
    private final double value;

    private final Unit unit;

    public Length(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Length other = (Length) obj;
        if(other.unit == this.unit){
            return Double.compare(other.value, value) == 0.0;
        }
        else{
            return Double.compare(convert(other.getValue(), other.unit), value) == 0.0;
        }
    }

    public double convert(double value, Unit fromUnit) {
        if (fromUnit == this.unit) {
            return value;
        }

        return value * fromUnit.getConversionFactor() / unit.getConversionFactor();
    }

    public Length add(Length other){

        double sum = other.unit == this.unit ? this.value + other.getValue(): convert(other.getValue(), other.unit) + this.value;

        return new Length(sum, this.unit);
    }

    public double getValue() {
        return value;
    }

    public Unit getUnit() {
        return unit;
    }
}

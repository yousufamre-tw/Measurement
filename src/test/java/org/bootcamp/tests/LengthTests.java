package org.bootcamp.tests;
import org.bootcamp.Unit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.bootcamp.Length;

public class LengthTests {
    @Test
    public void shouldReturnTrueForEqualMeasures() {
        Length centimeter1 = new Length(1.0, Unit.CENTIMETER);
        Length centimeter2 = new Length(1.0, Unit.CENTIMETER);

        boolean result = centimeter1.equals(centimeter2);
        Assertions.assertTrue(result);

    }

    @Test
    public void shouldReturnFalseForUnequalMeasures() {
        Length centimeter1 = new Length(1.0, Unit.CENTIMETER);
        Length centimeter2 = new Length(2.0, Unit.CENTIMETER);

        boolean result = centimeter1.equals(centimeter2);
        Assertions.assertFalse(result);
    }

    @Test
    public void shouldReturnTrueForSameMeasures() {
        Length centimeter = new Length(1.0, Unit.CENTIMETER);

        boolean result = centimeter.equals(centimeter);
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldTest100CentimetersAreEqualTo1Meter() {
        Length centimeter = new Length(100.0, Unit.CENTIMETER);
        Length meter = new Length(1.0, Unit.METER);

        boolean result = centimeter.equals(meter);
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldTest1MeterIsEqualTo100Centimeter() {
        Length centimeter = new Length(100.0, Unit.CENTIMETER);
        Length meter = new Length(1.0, Unit.METER);

        boolean result = meter.equals(centimeter);
        Assertions.assertTrue(result);
    }


    @Test
    public void shouldAddTheLengthsThat1mAnd200CmReturn2m() {
        Length centimeter = new Length(200.0, Unit.CENTIMETER);
        Length meter = new Length(1.0, Unit.METER);

        Length result = meter.add(centimeter);
        Assertions.assertEquals(3.0, result.getValue());
        Assertions.assertEquals(Unit.METER, result.getUnit());
    }

    @Test
    public void shouldAddTheLengthsThat200CmAnd1mReturn300cm() {
        Length centimeter = new Length(200.0, Unit.CENTIMETER);
        Length meter = new Length(1.0, Unit.METER);

        Length result = centimeter.add(meter);
        Assertions.assertEquals(300.0, result.getValue());
        Assertions.assertEquals(Unit.CENTIMETER, result.getUnit());
    }

    @Test
    public void shouldAddTheLengthsThat1MeterAnd2MeterReturn2m() {
        Length centimeter = new Length(2.0, Unit.METER);
        Length meter = new Length(1.0, Unit.METER);

        Length result = meter.add(centimeter);
        Assertions.assertEquals(3.0, result.getValue());
        Assertions.assertEquals(Unit.METER, result.getUnit());
    }
}

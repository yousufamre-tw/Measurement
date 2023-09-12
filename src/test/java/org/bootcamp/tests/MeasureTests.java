package org.bootcamp.tests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.bootcamp.Measure;

public class MeasureTests {
    @Test
    public void shouldReturnTrueForEqualMeasures() {
        Measure measure1 = new Measure(1.0); // 1 cm
        Measure measure2 = new Measure(1.0); // 1 cm

        boolean result = measure1.isEqual(measure2);
        Assertions.assertTrue(result);

    }

    @Test
    public void shouldReturnFalseForUnequalMeasures() {
        Measure measure1 = new Measure(1.0); // 1 cm
        Measure measure2 = new Measure(2.0); // 2 cm

        boolean result = measure1.isEqual(measure2);
        Assertions.assertFalse(result);
    }

    @Test
    public void shouldReturnTrueForSameMeasures() {
        Measure measure = new Measure(1.0); // 1 cm

        boolean result = measure.isSame(measure);
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldReturnFalseForDifferentMeasure() {
        Measure measure1 = new Measure(1.0); // 1 cm
        Measure measure2 = new Measure(1.0); // 2 cm

        boolean result = measure1.isSame(measure2);
        Assertions.assertFalse(result);
    }
}

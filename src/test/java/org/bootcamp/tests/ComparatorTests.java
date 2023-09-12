package org.bootcamp.tests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.bootcamp.Comparator;

public class ComparatorTests {
    @Test
    public void shouldReturnTrueForEqualLengths() {
        Comparator comparator1 = new Comparator(1.0); // 1 cm
        Comparator comparator2 = new Comparator(1.0); // 1 cm

        boolean result = comparator1.isEqual(comparator2);
        Assertions.assertTrue(result);

    }

    @Test
    public void shouldReturnFalseForUnequalLengths() {
        Comparator comparator1 = new Comparator(1.0); // 1 cm
        Comparator comparator2 = new Comparator(2.0); // 2 cm

        boolean result = comparator1.isEqual(comparator2);
        Assertions.assertFalse(result);
    }

    @Test
    public void shouldReturnTrueForSameLengths() {
        Comparator comparator = new Comparator(1.0); // 1 cm

        boolean result = comparator.isSame(comparator);
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldReturnFalseForDifferentLengths() {
        Comparator comparator1 = new Comparator(1.0); // 1 cm
        Comparator comparator2 = new Comparator(1.0); // 2 cm

        boolean result = comparator1.isSame(comparator2);
        Assertions.assertFalse(result);
    }
}

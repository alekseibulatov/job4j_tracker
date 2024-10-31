package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class PointTest {

    @Test
    public void checkDistance20To20Is00() {
        Point x = new Point(2, 0);
        Point y = new Point(2, 0);
        double distanceActual = x.distance(y);
        double distanceExpected = 0.0;
        assertThat(distanceActual).isEqualTo(distanceExpected);
    }

    @Test
    public void checkDistance21To10Is1dot41() {
        Point x = new Point(2, 1);
        Point y = new Point(1, 0);
        double distanceActual = x.distance(y);
        double distanceExpected = 1.41;
        assertThat(distanceActual).isCloseTo(distanceExpected, offset(0.01));
    }

    @Test
    public void checkDistance444To222Is3dot46() {
        Point x = new Point(4, 4, 4);
        Point y = new Point(2, 2, 2);
        double distanceActual = x.distance3d(y);
        double distanceExpected = 3.46;
        assertThat(distanceActual).isCloseTo(distanceExpected, offset(0.01));
    }

    @Test
    public void checkDistance753To934Is3dot00() {
        Point x = new Point(7, 5, 3);
        Point y = new Point(9, 3, 4);
        double distanceActual = x.distance3d(y);
        double distanceExpected = 3.00;
        assertThat(distanceActual).isCloseTo(distanceExpected, offset(0.01));
    }
}
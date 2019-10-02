package effective.java3e.chapter3.item10.inheritance;

import effective.java3e.chapter3.item10.Point;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Test program that uses CounterPoint as Point
public class CounterPointTest {

    // Initialize unitCircle to contain all Points on the unit circle (Java 9)
    /*private static final Set<Point> unitCircle = Set.of(
            new Point( 1,  0), new Point( 0,  1),
            new Point(-1,  0), new Point( 0, -1));*/

    private static final Set<Point> unitCircle =Stream.of(
            new Point( 1,  0), new Point( 0,  1),
            new Point(-1,  0), new Point( 0, -1))
            .collect(Collectors.toSet());

    public static boolean onUnitCircle(Point p) {
        return unitCircle.contains(p);
    }

    public static void main(String[] args) {
        Point p1 = new Point(1,  0);
        Point p2 = new CounterPoint(1,  0);

        // Prints true
        System.out.println(onUnitCircle(p1));

        // Should print true, but doesn't if Point uses getClass-based equals
        System.out.println(onUnitCircle(p2));
    }
}

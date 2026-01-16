package openclose.fixed;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(
                new Circle(2),
                new Rectangle(3, 4));
        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Total area: " + calculator.calculateTotalArea(shapes));
    }
}
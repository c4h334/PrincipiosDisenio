
package openclose.fixed;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(
                new Circle(3),
                new Rectangle(7, 89));

        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Total area: " + calculator.calculateTotalArea(shapes));
    }
}
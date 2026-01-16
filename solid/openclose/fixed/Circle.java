package openclose.fixed;

public class Circle extends AreaCalculator implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateTotalArea(Shape shape) {
        return Math.PI * Math.pow(getRadius(), 2);
    }

}

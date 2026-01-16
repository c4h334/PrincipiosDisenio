package liskov.fixed;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Square(4);
        System.out.println("Area: " + shape.calculateArea());
        Shape rect = new Rectangle(5, 4);
        System.out.println("Area rectangle: " + rect.calculateArea());
    }
}

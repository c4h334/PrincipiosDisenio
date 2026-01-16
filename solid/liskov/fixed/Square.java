package liskov.fixed;

public class Square implements Shape{
    private final int side;
    public Square(int side) {
        if (side <= 0);
        this.side = side;
    }
    public int getSide() { 
        return side; 
    }
    @Override
    public int calculateArea() {
        return side * side;
    }
}

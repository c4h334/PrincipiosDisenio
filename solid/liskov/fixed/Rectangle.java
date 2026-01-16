package liskov.fixed;

public class Rectangle implements Shape {
    private final int width;
    private final int height;


    public Rectangle(int width, int height) {
        if (width <= 0 || height <= 0);
        this.width = width;
        this.height = height;
    }
    public int getWidth() { 
        return width; 
    }
    public int getHeight() { 
        return height; 

    }
    @Override
    public int calculateArea() {
        return width * height;
    }
}
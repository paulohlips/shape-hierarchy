package shapes;

public class Square extends Shape {
    public  Square(String name, String color) {
        super(name, color);
    }

    @Override
    public double calculateArea(double input) {
        return Math.pow(input, 2);
    }

    @Override
    public double calculatePerimeter(double input) {
        return 4 * input;
    }
}

package shapes;

public class Circle extends Shape {
    public Circle(String name, String color) {
        super(name, color);
    }

    @Override
    public double calculateArea(double input) {
        return  Math.PI * Math.pow(input, 2);
    }

    @Override
    public double calculatePerimeter(double input) {
        return 2 * Math.PI * input;
    }
}

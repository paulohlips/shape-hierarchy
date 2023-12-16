package shapes;

public class Circle extends  Square {
    public Circle(String name, String color) {
        super(name, color);
    }

    public double area(double radius) {
        return  Math.PI * radius * radius;
    }

    public  double perimeter(double radius) {
        return 2 * Math.PI * radius;
    }
}

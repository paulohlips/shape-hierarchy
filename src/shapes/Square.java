package shapes;

public class Square extends  Shape {
    private double side;

    public  Square(String name, String color) {
        super(name, color);
        this.side = side;
    }

    public double area (double side) {
        return side * side;
    }

    public  double perimeter(double perimeter) {
        return 4*perimeter;
    }
}

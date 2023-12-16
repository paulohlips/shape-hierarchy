import shapes.Circle;
import shapes.Square;

public class Main {
    public static void main(String[] args) {
        Square square = new Square("square", "red");
        Circle circle = new Circle("circle", "blue");

        System.out.println(square.calculateArea(4));
        System.out.println(square.calculatePerimeter(10));

        System.out.println(circle.calculateArea(1));
        System.out.println(circle.calculatePerimeter(5));

    }
}
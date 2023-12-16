import shapes.Circle;
import shapes.Shape;
import shapes.Square;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square("square", "red");
        Shape circle = new Circle("circle", "blue");

        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(square);
        shapes.add(circle);


        shapes.forEach(shape -> {
            shape.shapeData();
            System.out.println(shape.calculatePerimeter(10));
            System.out.println(shape.calculateArea(10));
            System.out.println();
        });

    }
}
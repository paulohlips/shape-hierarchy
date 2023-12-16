public class Main {
    public static void main(String[] args) {
        Square square = new Square("square", "red");
        Circle circle = new Circle("circle", "blue");

        System.out.println(square.area(4));
        System.out.println(square.perimeter(10));

        System.out.println(circle.area(1));
        System.out.println(circle.perimeter(5));

    }
}
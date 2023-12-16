package shapes;

public abstract class Shape implements AreaCalculable, PerimeterCalculable {
    private String name;
    private String color;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
  }

  public void shapeData() {
      System.out.println(this.name + " " + this.color);
  }
}

// Shape.java, Rectangle.java, Circle.java are the same as above

// Square.java  
public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}

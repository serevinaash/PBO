
// Main.java (extended)
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(7);
        Shape square = new Square(4);

        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.calculateTotalArea(Arrays.asList(rectangle, circle, square));

        System.out.println("Total Area: " + totalArea);
    }
}

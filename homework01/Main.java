package homework01;

public class Main {
    public static void main(String[] args) {

        System.out.println("============================");

        Circle circle1 = new Circle(10);
        circle1.calculateArea();
        circle1.calculatePerimeter();

        System.out.println("============================");

        Rectangle rectangle = new Rectangle(10, 20);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        System.out.println("============================");

        Square square = new Square(10);
        square.calculateArea();
        square.calculatePerimeter();

        System.out.println("============================");

    }
}

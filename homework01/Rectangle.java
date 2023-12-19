package homework01;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        if (length > 0 && width > 0) {
            this.length = length;
            this.width = width;
        }
    }

    public void calculateArea() {
        if (length != 0 && width != 0) {
            System.out.println("Площадь прямоугольника " + length * width);
        }
    }

    public void calculatePerimeter() {
        if (length != 0 && width != 0) {
            System.out.println("Периметр прямоугольника " + (length + width) * 2);
        }
    }
}

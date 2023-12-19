package homework01;

public class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public void calculateArea() {
        if (radius != 0) {
            System.out.println("Площадь круга " + Math.PI * Math.pow(radius, 2));
        }
    }

    public void calculatePerimeter() {
        if (radius != 0) {
            System.out.println("Периметр круга " + 2 * Math.PI * radius);
        }
    }
}

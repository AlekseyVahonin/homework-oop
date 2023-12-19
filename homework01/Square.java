package homework01;

public class Square extends Rectangle{

    private double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public void calculateArea() {
        if (length != 0 && width != 0) {
            System.out.println("Площадь квадрата " + Math.pow(side, 2));
        }
    }

    @Override
    public void calculatePerimeter() {
        if (length != 0 && width != 0) {
            System.out.println("Периметр квадрата " + side * 4);
        }
    }
}

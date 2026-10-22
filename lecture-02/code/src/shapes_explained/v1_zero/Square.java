package shapes_explained.v1_zero;

/**
 * المربع: ضلع واحد.
 */
public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getCircumference() {
        return 4 * side;
    }

    @Override
    public void printInfo() {
        System.out.println("Square: Side = " + side + " , Area = " + getArea() + " , Circumference = " + getCircumference());
    }
}

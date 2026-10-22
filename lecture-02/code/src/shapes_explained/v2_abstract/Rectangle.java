package shapes_explained.v2_abstract;

/**
 * المستطيل: الطول x والعرض y.
 */
public class Rectangle extends Shape {
    private double x;
    private double y;

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public double getArea() {
        return x * y;
    }

    @Override
    public double getCircumference() {
        return 2 * (x + y);
    }

    @Override
    public void printInfo() {
        System.out.println("Rectangle: x = " + x + " , y = " + y + " , Area = " + getArea() + " , Circumference = " + getCircumference());
    }
}

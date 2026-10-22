package shapes_explained.v2_abstract;

/**
 * الدائرة: صف عادي (غير مجرد)، لذلك يجب أن يكتب كل التوابع المجردة التي في Shape.
 */
public class Circle extends Shape {
    private double radius;          // خاصية: نصف القطر

    public Circle(double radius) {  // باني
        this.radius = radius;
    }

    public double getRadius() {     // تابع get: يعطي القيمة للخارج
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void printInfo() {
        System.out.println("Circle: Radius = " + radius + " , Area = " + getArea() + " , Circumference = " + getCircumference());
    }
}

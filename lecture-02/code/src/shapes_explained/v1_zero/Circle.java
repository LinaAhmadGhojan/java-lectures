package shapes_explained.v1_zero;

/**
 * الدائرة ترث من Shape وتعيد كتابة (Override) التوابع الثلاثة بحسابها الحقيقي.
 */
public class Circle extends Shape {
    private double radius;          // نصف القطر (الخاصية الوحيدة التي تصف الدائرة)

    public Circle(double radius) {  // الباني: يعطي الغرض قيمته الأولى
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;       // π × r²
    }

    @Override
    public double getCircumference() {
        return 2 * Math.PI * radius;            // 2 × π × r
    }

    @Override
    public void printInfo() {
        System.out.println("Circle: Radius = " + radius + " , Area = " + getArea() + " , Circumference = " + getCircumference());
    }
}

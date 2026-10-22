package shapes_explained.mistake_area_attribute;

/**
 * الطريقة الصحيحة: نخزّن فقط ما لا نستطيع حسابه (نصف القطر)،
 * والمساحة تابع يحسبها من نصف القطر الحالي في كل مرة نطلبها.
 */
public class CircleRight {
    private double radius;

    public CircleRight(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;                       // لا شيء آخر نحدّثه: لا توجد نسخة ثانية من المعلومة
    }

    public double getArea() {
        return Math.PI * radius * radius;           // تُحسب من radius الحالي دائماً
    }
}

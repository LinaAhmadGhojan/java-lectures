package shapes_explained.v1_zero;

/**
 * النسخة الأولى (غير الاحترافية): الصف Shape عادي، وتوابعه ترجع 0.0.
 * الفكرة: "أنا شكل، لكن لا أعرف أي شكل بالضبط، فمساحتي وهمية".
 * سنرى أن هذا يعمل، لكنه يخبّئ الأخطاء بدل أن يكشفها.
 */
public class Shape {

    // مساحة وهمية: نرجع 0.0 لأن الشكل العام لا يعرف كيف يحسب
    public double getArea() {
        return 0.0;
    }

    // محيط وهمي
    public double getCircumference() {
        return 0.0;
    }

    public void printInfo() {
        System.out.println("Shape: Area = " + getArea() + " , Circumference = " + getCircumference());
    }
}

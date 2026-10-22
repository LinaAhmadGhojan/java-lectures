package shapes_explained.v1_zero;

/**
 * المستطيل: الطول x والعرض y.
 * انتبه: كاتب هذا الصف نسي أن يكتب getArea!
 * لا يوجد أي خطأ في الترجمة، والبرنامج يعمل، لكن المساحة ستظهر 0.0 (جواب خاطئ بصمت).
 * هذا هو سبب أن الصف Shape العادي (بدون abstract) يخبّئ الأخطاء.
 */
public class Rectangle extends Shape {
    private double x;
    private double y;

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // نسينا getArea() هنا: ستعمل نسخة Shape التي ترجع 0.0

    @Override
    public double getCircumference() {
        return 2 * (x + y);
    }

    @Override
    public void printInfo() {
        System.out.println("Rectangle: x = " + x + " , y = " + y + " , Area = " + getArea() + " , Circumference = " + getCircumference());
    }
}

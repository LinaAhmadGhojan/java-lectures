package shapes_explained.mistake_area_attribute;

/**
 * الطريقة الخاطئة (يقع فيها كثير من الطلاب): نخزّن المساحة كـ "خاصية".
 * تبدو صحيحة في البداية، لكنها تعطي جواباً قديماً (خاطئاً) بعد تغيير نصف القطر.
 */
public class CircleWrong {
    double radius;
    double area;                    // خطأ: معلومة يمكن حسابها من radius، لكننا خزّناها

    public CircleWrong(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;      // حسبناها مرة واحدة فقط، عند البناء
    }

    public void setRadius(double radius) {
        this.radius = radius;                       // غيّرنا نصف القطر... ونسينا تحديث area!
    }
}

package shapes_explained.mistake_area_attribute;

/**
 * مقارنة بين: المساحة كخاصية (خطأ) والمساحة كتابع (صحيح).
 */
public class Main {
    public static void main(String[] args) {
        CircleWrong wrong = new CircleWrong(5);
        CircleRight right = new CircleRight(5);

        System.out.println("--- radius = 5 ---");
        System.out.println("area as attribute : " + wrong.area);
        System.out.println("area as method    : " + right.getArea());

        // غيّرنا نصف القطر في الدائرتين إلى 10
        wrong.setRadius(10);
        right.setRadius(10);

        System.out.println("--- radius changed to 10 ---");
        System.out.println("area as attribute : " + wrong.area + "   <-- OLD value (wrong!)");
        System.out.println("area as method    : " + right.getArea() + "   <-- correct");
    }
}

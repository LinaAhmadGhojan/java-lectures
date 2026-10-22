package shapes_explained.v1_zero;

/**
 * عرض مشكلتين: ماذا يحدث لو لم نكتب abstract في Shape؟ لا يحتاج إدخالاً.
 */
public class Main {
    public static void main(String[] args) {
        // مشكلة 1: نستطيع بناء "شكل عام" لا معنى له، ومساحته 0.0
        Shape nothing = new Shape();
        nothing.printInfo();

        // مشكلة 2: المستطيل نسي كاتبه getArea: لا خطأ، والجواب 0.0 وهو خاطئ
        Shape rect = new Rectangle(4, 6);
        System.out.println("Rectangle area = " + rect.getArea() + "   <-- wrong! it should be 24. No error was reported");

        // الدائرة والمربع كاملان فيعملان بشكل صحيح، أما المستطيل فيطبع 0.0 بصمت
        Shape[] all = {new Circle(5), new Rectangle(4, 6), new Square(3)};
        for (Shape s : all) {
            s.printInfo();
        }
    }
}

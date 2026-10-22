package shapes_explained.v2_abstract;

import java.util.Scanner;

/**
 * الصف الرئيسي: المستخدم يختار نوع الشكل، ثم نبني الغرض المناسب ونطبع معلوماته.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Shape sh;                       // مرجع من النوع الأب: يستطيع حمل أي ابن
        double x, y;

        System.out.println("Enter: 1 for Circle, 2 for Rectangle, 3 for Square");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Radius = ");
                x = input.nextDouble();
                sh = new Circle(x);     // غرض دائرة داخل مرجع Shape
                sh.printInfo();         // يُنفَّذ printInfo الخاص بالدائرة
                break;
            case 2:
                System.out.println("x = ");
                x = input.nextDouble();
                System.out.println("y = ");
                y = input.nextDouble();
                sh = new Rectangle(x, y);
                sh.printInfo();
                break;
            case 3:
                System.out.println("Side = ");
                x = input.nextDouble();
                sh = new Square(x);
                sh.printInfo();
                break;
            default:
                System.out.println("You entered a wrong number");
        }

        // قوة التجريد: مصفوفة من النوع Shape فيها أشكال مختلفة، وحلقة واحدة تعاملها كلها
        System.out.println("---- all shapes together ----");
        Shape[] all = {new Circle(1), new Rectangle(2, 3), new Square(4)};
        double total = 0;
        for (Shape s : all) {
            total += s.getArea();       // نفس السطر يحسب مساحة كل شكل بطريقته
        }
        System.out.println("Total area = " + total);
    }
}

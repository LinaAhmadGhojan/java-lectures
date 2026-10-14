package exercises.ex1_student;

// استيراد (import): نستدعي صفاً جاهزاً من مكتبة Java اسمه Scanner.
// Scanner = أداة تقرأ ما يكتبه المستخدم من لوحة المفاتيح. بدون هذا السطر لا يعرفه المترجم.
import java.util.Scanner;

/**
 * التمرين 1: صف طالب (الاسم + مصفوفة علامات) مع بانيين وتابعين، و main في نفس الملف.
 * المفاهيم: الصف والغرض، الباني الافتراضي والباني ذو الوسائط، المصفوفات، Scanner.
 */
public class Student {
    // ---------------------------------------------------------------- الخصائص
    String name;                  // اسم الطالب
    int[] marks = new int[3];     // مصفوفة بثلاث علامات (فهارسها 0 و 1 و 2)

    // ---------------------------------------------------------------- البانيان
    // باني افتراضي: بدون وسائط، يبني طالباً فارغاً (الاسم null والعلامات أصفار)
    public Student() {
    }

    // باني بالقيم: يأخذ اسماً ومصفوفة علامات ويعبّئ بهما الغرض
    //   n = الاسم، m = مصفوفة العلامات (أسماء الوسائط اختصارات)
    public Student(String n, int[] m) {
        name = n;
        // ننسخ العلامات عنصراً عنصراً (بدلاً من marks = m حتى لا يشترك الغرضان بنفس الذاكرة)
        for (int i = 0; i < m.length; i++)
            marks[i] = m[i];
    }

    // ---------------------------------------------------------------- التوابع
    // تابع يحسب المعدل ويرجعه. double = عدد عشري، و return = ارجع بهذه القيمة
    double avg() {
        double sum = 0.0;                         // المجموع (نبدأ من صفر)
        for (int i = 0; i < marks.length; i++)    // نمر على كل العلامات
            sum += marks[i];                      // نضيف كل علامة للمجموع
        return sum / marks.length;                // المعدل = المجموع ÷ العدد
    }

    // تابع يطبع معلومات الطالب. void = لا يرجع شيئاً، فقط يطبع
    void printInfo() {
        System.out.println("name: " + name);
        for (int i = 0; i < marks.length; i++)
            System.out.println(marks[i]);
        System.out.println("average: " + avg());
    }

    // ---------------------------------------------------------------- البرنامج الرئيسي
    // نقطة بداية البرنامج (انظر شرح main في basics/variables/VariablesDemo)
    public static void main(String[] args) {
        // الخطوة 1: أداة قراءة من لوحة المفاتيح (System.in = الدخل القياسي)
        Scanner input = new Scanner(System.in);
        String n;
        int[] m = new int[3];

        // الخطوة 2: نقرأ اسم الطالب (next() تقرأ كلمة واحدة)
        System.out.println("Enter student name: ");
        n = input.next();

        // الخطوة 3: نقرأ ثلاث علامات ونخزنها بالمصفوفة (nextInt() تقرأ عدداً صحيحاً)
        for (int i = 0; i < m.length; i++) {
            System.out.println("Enter Mark " + i);
            m[i] = input.nextInt();
        }

        // الخطوة 4: نبني الغرض (الباني ينسخ الاسم والعلامات)
        Student s = new Student(n, m);

        // الخطوة 5: نطبع معلوماته (الاسم، العلامات، المعدل)
        System.out.println();
        System.out.println("Student Info: ");
        s.printInfo();
    }
}

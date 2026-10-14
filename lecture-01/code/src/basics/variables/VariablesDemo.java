// package: يحدد "المجلد المنطقي" للصف. يجب أن يطابق مجلد الملف (basics/variables)
package basics.variables;

/**
 * المتحولات (Variables): صندوق له اسم ونوع نخزّن فيه قيمة.
 * مثال واقعي: بطاقة الطالب الجامعية (اسم، سنة، معدل، شعبة، مسجّل أو لا).
 */
// public: عام، أي يستطيع أي صف آخر رؤيته واستعماله.
// class : كلمة تعني "صف" (قالب). اسمه VariablesDemo يجب أن يطابق اسم الملف.
public class VariablesDemo {

    // main = نقطة بداية البرنامج: عند التشغيل تبدأ Java التنفيذ من هنا.
    //   public  : عام، يستطيع نظام Java استدعاءها من الخارج
    //   static  : ثابتة، تخص الصف نفسه فلا نحتاج بناء غرض لتشغيلها
    //   void    : لا ترجع قيمة، تنفذ تعليمات فقط
    //   String[] args : مصفوفة نصوص تُمرَّر عند التشغيل (لا نستعملها الآن)
    public static void main(String[] args) {

        // صيغة تعريف أي متحول:  النوع  الاسم = القيمة;
        String name = "Ahmad";      // String = نص (يُكتب بين علامتي اقتباس مزدوجتين " ")
        int year = 2;               // int = عدد صحيح (بدون فاصلة)
        double gpa = 78.5;          // double = عدد عشري (فيه فاصلة)
        char section = 'B';         // char = محرف واحد (بين علامتي اقتباس مفردتين ' ')
        boolean registered = true;  // boolean = صح أو خطأ فقط (true / false)

        // System.out.println(...) = اطبع ما بين القوسين ثم انتقل لسطر جديد
        // علامة + بين النص والمتحول تعني "الصق معاً"
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
        System.out.println("Average: " + gpa);
        System.out.println("Section: " + section);
        System.out.println("Registered: " + registered);

        // فخ شائع: القسمة بين عددين صحيحين تعطي عدداً صحيحاً (يُحذف الكسر)
        System.out.println(7 / 2);    // 3   وليس 3.5
        // إذا كان أحد العددين عشرياً (2.0) يكون الناتج عشرياً
        System.out.println(7 / 2.0);  // 3.5

        // لا يمكن تعريف نفس الاسم مرتين ضمن نفس المجال:
        // int year = 3;   // خطأ ترجمة: variable year is already defined
    }
}

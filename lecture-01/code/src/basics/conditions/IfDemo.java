package basics.conditions;

/**
 * الشرط (if): البرنامج يتخذ قراراً بناءً على حالة.
 * مثال واقعي: نتيجة الطالب (ناجح / راسب) وتقدير العلامة.
 */
public class IfDemo {
    // نقطة بداية البرنامج (انظر شرح main في VariablesDemo)
    public static void main(String[] args) {

        // مثال المحاضرة: زوجي أم فردي
        int x = 5;

        // % تسمى "باقي القسمة": 5 % 2 = 1 (لأن 5 = 2×2 + 1)
        // == تعني "يساوي" (للمقارنة). أما = وحدها فهي لإعطاء قيمة.
        // إذا تحقق الشرط ننفذ ما بين أول {} ، وإلا ننفذ ما بعد else
        if (x % 2 == 0) {
            System.out.println("even");   // even = زوجي
        } else {
            System.out.println("odd");    // odd = فردي
        }

        // if ... else if ... else : نفحص الشروط بالترتيب، وينفَّذ أول شرط صحيح فقط
        int mark = 73;
        if (mark >= 90) {                 // >= تعني "أكبر من أو يساوي"
            System.out.println("Excellent");
        } else if (mark >= 80) {
            System.out.println("Very good");
        } else if (mark >= 60) {
            System.out.println("Pass");   // 73 تحقق هذا الشرط، فيُطبع Pass
        } else {                          // إذا لم يتحقق أي شرط قبله
            System.out.println("Fail");
        }

        // فخ شائع: = للإسناد و == للمقارنة
        // if (x = 5)  // خطأ ترجمة في Java
    }
}

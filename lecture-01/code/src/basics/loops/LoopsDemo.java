package basics.loops;

/**
 * الحلقات (Loops): تكرار تعليمات.
 * مثال واقعي: تصحيح أوراق 3 طلاب، أو مناداة أسماء الطلاب في القاعة.
 */
public class LoopsDemo {
    // نقطة بداية البرنامج (انظر شرح main في VariablesDemo)
    public static void main(String[] args) {

        // 1) for: نعرف عدد التكرارات مسبقاً
        //    الأقواس الثلاثة: (بداية العداد ; شرط الاستمرار ; ماذا نفعل بعد كل دورة)
        //    i++ تعني "زد i بمقدار 1". تُنفَّذ الحلقة مع i = 0 ثم 1 ثم 2 (3 مرات)
        for (int i = 0; i < 3; i++) {
            System.out.println("for: Hi " + i);
        }

        // 2) while: نتحقق من الشرط قبل التنفيذ، وننفذ طالما هو صحيح
        int j = 0;
        while (j < 3) {
            System.out.println("while: Hi " + j);
            j++;   // لو نسينا هذا السطر: حلقة لا نهائية!
        }

        // 3) do-while: ننفذ مرة على الأقل ثم نتحقق من الشرط
        int k = 10;
        do {
            // الشرط (k < 3) خاطئ من البداية، ومع ذلك تُطبع هذه الجملة مرة واحدة
            System.out.println("do-while runs once even though k < 3 is false");
            k++;
        } while (k < 3);

        // تطبيق: مجموع علامات طالب وحساب معدله
        // {70, 85, 90} = مصفوفة (Array): عدة قيم من نفس النوع بجانب بعضها
        int[] marks = {70, 85, 90};
        int sum = 0;                              // نبدأ المجموع من صفر
        for (int i = 0; i < marks.length; i++) {  // marks.length = عدد عناصر المصفوفة (3)
            sum += marks[i];                      // sum += x تعني sum = sum + x
        }
        // (double) تحويل المجموع لعدد عشري حتى لا تُحذف الكسور من القسمة
        System.out.println("Sum = " + sum + ", Average = " + (double) sum / marks.length);
    }
}

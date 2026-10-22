package shapes_explained.v2_abstract;

/**
 * النسخة الثانية (الاحترافية): الصف Shape مجرد (abstract).
 * نقول فيه: "كل شكل له مساحة ومحيط وطباعة معلومات، لكني لا أعرف كيف تُحسب،
 * وكل شكل ابن مُلزَم بأن يكتب طريقته بنفسه".
 *
 * قواعد abstract:
 *  1) الصف الذي فيه تابع مجرد يجب أن يكون abstract أيضاً.
 *  2) التابع المجرد بلا جسم: ينتهي بفاصلة منقوطة ; مباشرة.
 *  3) لا نستطيع كتابة new Shape() (لا معنى لـ "شكل" فقط).
 *  4) كل ابن (غير مجرد) مُلزَم بكتابة كل التوابع المجردة، وإلا لن يُترجم الكود.
 */
public abstract class Shape {

    public abstract double getArea();            // لاحظ: لا { } ولا return

    public abstract double getCircumference();

    public abstract void printInfo();
}

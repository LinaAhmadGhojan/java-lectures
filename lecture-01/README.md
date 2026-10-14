# المحاضرة 1: مراجعة أساسيات Java والبرمجة غرضية التوجه

## محتويات المحاضرة

### 📄 الشرح والتمرين (مجلد `files/`)، اقرأها بالترتيب

| # | الملف | ما هو |
|---|---|---|
| 1 | [01_basics.pdf](files/01_basics.pdf) | الأساسيات: المتغيرات، الشروط، الحلقات، المصفوفات، التوابع |
| 2 | [02_oop.pdf](files/02_oop.pdf) | البرمجة غرضية التوجه: الصف والغرض، الباني، التغليف، الوراثة، تعدد الأشكال، التجريد |
| 3 | [03_class_relationships.pdf](files/03_class_relationships.pdf) | العلاقات بين الصفوف: ارتباط، تجميع، تركيب (قصة السيارة والجامعة) |
| 4 | [04_exercise1_question.png](files/04_exercise1_question.png) | **سؤال التمرين 1** (حاول حله بنفسك أولاً) |
| 5 | [05_exercise1_solution.pdf](files/05_exercise1_solution.pdf) | حل التمرين 1 مع الشرح |
| 6 | [06_homework2_question.png](files/06_homework2_question.png) | **الواجب 2: فاتورة مشتريات** (حاول حله بنفسك) |
| 7 | [07_homework2_invoice_output.png](files/07_homework2_invoice_output.png) | شكل ناتج الفاتورة المطلوب (قارن به بعد حل الواجب) |

### 💻 الكود (مجلد `code/`)

| المثال | الملف |
|---|---|
| المتغيرات | `src/basics/variables/VariablesDemo.java` |
| الشرط if | `src/basics/conditions/IfDemo.java` |
| الحلقات | `src/basics/loops/LoopsDemo.java` |
| **التمرين 1: الطالب** | `src/exercises/ex1_student/Student.java` |

في كل ملف تعليقات بالعربي (الأسطر التي تبدأ بـ `//`) تشرح الكود والكلمات الإنجليزية.

---

## ▶️ كيف أشغّل الكود؟ (جاهز مباشرة)

> **مهم:** ضع المجلد في مسار **إنجليزي بالكامل** (مثل `C:\java-lectures`). المسار الذي فيه حروف عربية يسبب الخطأ `Could not find or load main class`.

### الطريقة 1: بنقرة واحدة (الأسهل)
- **Windows:** افتح مجلد `lecture-01/code` وانقر مرتين على الملف **`run.bat`**.
- **Linux / macOS:** من داخل `lecture-01/code` اكتب: `sh run.sh`

تظهر قائمة بأرقام الأمثلة. اكتب الرقم واضغط Enter:

```
  1) Variables
  2) If / else
  3) Loops (for, while, do-while)
  4) Exercise 1: Student   (the input is read from the file input.txt)
  5) Exercise 1: Student   (you type the input yourself)
  0) Exit
```

قبل تشغيل كل مثال تطبع القائمة **اسم المجلد والملف** الذي فيه الكود، فافتحه واقرأه.

### 📝 الإدخال جاهز في ملف `input.txt`
التمرين 1 يطلب اسم طالب وثلاث علامات. لا تحتاج أن تكتبها كل مرة:
اختر **الرقم 4** وسيقرأ البرنامج الإدخال من الملف [`code/input.txt`](code/input.txt) ويعرضه بالأخضر، ثم يطبع النتيجة مباشرة:

```
Enter student name:
Ahmad
Enter Mark 0
70
...
average: 81.66666666666667
```

**جرّب بنفسك:** افتح `input.txt` وغيّر القيم، ثم شغّل الرقم 4 من جديد.

```
الاسم          ← السطر 1
العلامة 0      ← السطر 2
العلامة 1      ← السطر 3
العلامة 2      ← السطر 4
```

- اكتب **اسماً بالإنجليزي** وبكلمة واحدة، والعلامات أعداداً صحيحة.
- إذا حذفت الملف أو لم تجده، يطلب منك البرنامج أن تكتب الإدخال بنفسك.
- **الرقم 5** يشغّل نفس التمرين وتكتب الإدخال بلوحة المفاتيح.

### الطريقة 2: IntelliJ IDEA
1. `File` ← `Open` ← اختر المجلد **`lecture-01/code`**.
2. إذا ظهر شريط أصفر "Project SDK is not defined": اضغط **Setup SDK** واختر JDK (الإصدار 8 أو أحدث).
3. شغّل الإعداد **MainMenu** (السهم الأخضر أعلى اليمين)، أو افتح أي ملف فيه `main` واضغط السهم الأخضر بجانبه.

### الطريقة 3: سطر الأوامر
من داخل `lecture-01/code`:

```bash
javac -encoding UTF-8 -sourcepath src -d out src/launcher/MainMenu.java
java -cp out launcher.MainMenu
```

أو لتشغيل التمرين 1 مباشرة:

```bash
javac -encoding UTF-8 -d out src/exercises/ex1_student/Student.java
java -cp out exercises.ex1_student.Student
```

### المتطلبات
- **JDK** (وليس JRE فقط): الإصدار 8 أو أحدث. للتحميل: <https://adoptium.net>
- للتأكد: افتح سطر الأوامر واكتب `javac -version`

---

## ✍️ نصيحة

حاول حل التمرين 1 **بنفسك أولاً** (من الصورة)، ثم قارن بالحل. اكتب الكود بيدك ولا تنسخه، فهكذا تتعلم أسرع.

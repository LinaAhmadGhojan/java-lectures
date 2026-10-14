package launcher;

import java.io.IOException;

/**
 * القائمة الرئيسية للمحاضرة الأولى: شغّل هذا الملف، واختر رقم المثال.
 * قبل التشغيل يطبع لك مكان الكود (المجلد والملف)، حتى تفتحه وتقرأه.
 * مفهوم مستعمل هنا: حلقة do-while (تُنفَّذ مرة على الأقل، ثم تكرر حتى تختار 0).
 *
 * ملاحظة: القائمة بالإنجليزي حتى تظهر بشكل سليم في أي نافذة تشغيل (Console).
 */
public class MainMenu {

    // ألوان لنافذة Run في IntelliJ. تُطفأ تلقائياً في نافذة الأوامر العادية (cmd) لأنها تُظهر رموزاً غريبة.
    static final boolean COLORS = System.console() == null;
    static final String RESET = "\u001B[0m";
    static final String BLUE = "\u001B[1;34m";
    static final String GREEN = "\u001B[32m";
    static final String RED = "\u001B[31m";

    static String paint(String color, String text) {
        return COLORS ? color + text + RESET : text;
    }

    static final int SHOW_MENU = -2;   // يعني أن المستخدم كتب m

    public static void main(String[] args) {
        int choice;

        printMenu();   // القائمة تظهر مرة واحدة فقط، ثم عند كتابة m

        do {
            System.out.print(paint(BLUE, "Enter a number (m = show menu, 0 = exit): "));
            choice = readChoice();
            if (choice == SHOW_MENU) {
                printMenu();
            } else {
                run(choice);
            }
        } while (choice != 0);   // 0 = خروج
    }

    // ---------------------------------------------------------------- القائمة

    static void printMenu() {
        System.out.println();
        System.out.println(paint(BLUE, "=========== Java Lectures - Lecture 1 ==========="));
        System.out.println(" -- Java basics (review) --");
        System.out.println("  1) Variables");
        System.out.println("  2) If / else");
        System.out.println("  3) Loops (for, while, do-while)");
        System.out.println(" -- Exercise --");
        System.out.println("  4) Exercise 1: Student   (the input is read from the file input.txt)");
        System.out.println("  5) Exercise 1: Student   (you type the input yourself)");
        System.out.println("  0) Exit");
    }

    /** يقرأ الرقم. يرجع -1 إذا لم يكن رقماً صحيحاً، و SHOW_MENU إذا كتب m. */
    static int readChoice() {
        String line = readLine();
        if (line == null) {
            return 0;   // انتهى الإدخال: نخرج
        }
        if (line.trim().equalsIgnoreCase("m")) {
            return SHOW_MENU;
        }
        try {
            return Integer.parseInt(line.trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    // ---------------------------------------------------------------- التنفيذ

    static void run(int choice) {
        String[] noArgs = new String[0];

        try {
            switch (choice) {
                case 0:
                    System.out.println(paint(GREEN, "Goodbye!"));
                    return;

                case 1:
                    show("Variables", "src/basics/variables", "VariablesDemo.java");
                    basics.variables.VariablesDemo.main(noArgs);
                    break;
                case 2:
                    show("If / else", "src/basics/conditions", "IfDemo.java");
                    basics.conditions.IfDemo.main(noArgs);
                    break;
                case 3:
                    show("Loops", "src/basics/loops", "LoopsDemo.java");
                    basics.loops.LoopsDemo.main(noArgs);
                    break;

                case 4:
                    show("Exercise 1: Student (input from input.txt)", "src/exercises/ex1_student", "Student.java (the main method is inside the class)");
                    // نشغّل نفس برنامج التمرين، لكن "ما يكتبه المستخدم" يأتي من الملف input.txt
                    runWithInputFile("input.txt", () -> exercises.ex1_student.Student.main(noArgs));
                    break;
                case 5:
                    show("Exercise 1: Student (you type the input)", "src/exercises/ex1_student", "Student.java (the main method is inside the class)");
                    exercises.ex1_student.Student.main(noArgs);
                    break;

                default:
                    System.out.println(paint(RED, "Invalid choice. Enter a number from 0 to 5, or m to show the menu."));
                    return;
            }
        } catch (Exception e) {
            // حتى لو أخطأ المستخدم بالإدخال داخل أحد الأمثلة، تبقى القائمة تعمل
            System.out.println(paint(RED, "The program stopped because of: " + e));
        }

        System.out.println();
        System.out.println(paint(GREEN, "================ end of example ================"));
        System.out.println();
    }

    // ------------------------------------------------------- الإدخال من ملف

    /**
     * يشغّل برنامجاً يقرأ من لوحة المفاتيح (Scanner) لكن يعطيه محتوى ملف نصي بدل ما يكتبه المستخدم.
     * كل سطر يُقرأ من الملف نطبعه بالأخضر حتى نرى الإدخال كأنه كُتب بيدنا.
     * إذا لم يوجد الملف نرجع للإدخال اليدوي.
     */
    static void runWithInputFile(String fileName, Runnable program) {
        java.io.File file = new java.io.File(fileName);
        if (!file.exists()) {
            System.out.println(paint(RED, "File " + fileName + " was not found, so type the input yourself:"));
            program.run();
            return;
        }
        System.out.println(paint(BLUE, "(the input is read from " + fileName + " - open it and change the values!)"));
        java.io.InputStream original = System.in;
        try {
            System.setIn(new LineEchoInputStream(new java.io.FileInputStream(file)));
            program.run();
        } catch (IOException e) {
            System.out.println(paint(RED, "Could not read " + fileName + ": " + e));
        } finally {
            System.setIn(original);   // نرجع الدخل الأصلي ليعمل مع القائمة
        }
    }

    /** مجرى دخل يعطي الملف سطراً سطراً ويطبع كل سطر بالأخضر عند قراءته. */
    static class LineEchoInputStream extends java.io.InputStream {
        private final java.io.BufferedReader reader;
        private byte[] pending = new byte[0];
        private int pos = 0;

        LineEchoInputStream(java.io.InputStream in) throws IOException {
            this.reader = new java.io.BufferedReader(new java.io.InputStreamReader(in, "UTF-8"));
        }

        private boolean fill() throws IOException {
            String line = reader.readLine();
            if (line == null) {
                return false;
            }
            System.out.println(paint(GREEN, line));
            pending = (line + "\n").getBytes("UTF-8");
            pos = 0;
            return true;
        }

        @Override
        public int read() throws IOException {
            if (pos >= pending.length && !fill()) {
                return -1;
            }
            return pending[pos++] & 0xFF;
        }

        @Override
        public int read(byte[] b, int off, int len) throws IOException {
            if (len == 0) {
                return 0;
            }
            if (pos >= pending.length && !fill()) {
                return -1;
            }
            int n = Math.min(len, pending.length - pos);
            System.arraycopy(pending, pos, b, off, n);
            pos += n;
            return n;
        }
    }

    /** يطبع اسم المثال ومكان الكود قبل تشغيله. */
    static void show(String title, String folder, String file) {
        System.out.println();
        System.out.println(paint(GREEN, "================================================"));
        System.out.println(paint(BLUE, ">>> " + title));
        System.out.println(paint(RED, ">>> Code folder: " + folder));
        System.out.println(paint(RED, ">>> Open file:   " + file));
        System.out.println(paint(GREEN, "-------------------- output --------------------"));
    }

    // ------------------------------------------------------------------ قراءة

    /**
     * يقرأ سطراً غير فارغ من الدخل، ويتجاهل الأسطر الفارغة.
     * (أمثلة التمارين تستعمل Scanner وقد تترك سطراً فارغاً في الدخل بعد انتهائها.)
     * نقرأ حرفاً حرفاً حتى لا نأخذ من الدخل أكثر مما نحتاج.
     */
    static String readLine() {
        try {
            while (true) {
                StringBuilder sb = new StringBuilder();
                int c;
                while ((c = System.in.read()) != -1 && c != '\n') {
                    if (c != '\r') {
                        sb.append((char) c);
                    }
                }
                if (sb.length() > 0) {
                    return sb.toString();
                }
                if (c == -1) {
                    return null;   // نهاية الدخل
                }
            }
        } catch (IOException e) {
            return null;
        }
    }
}

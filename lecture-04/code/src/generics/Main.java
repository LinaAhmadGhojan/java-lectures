package generics;

/**
 * يجرّب كل ما شرحناه: الصندوق العام، والزوج، والدوال العامة، والواجهة العامة.
 */
public class Main {
    public static void main(String[] args) {
        // ---- الصندوق العام
        Box<String> b1 = new Box<>("Java");
        Box<Integer> b2 = new Box<>(25);
        String s = b1.get();            // بدون Casting
        int n = b2.get();               // Unboxing تلقائي
        System.out.println(s + " " + n);

        // ---- الزوج
        Pair<String, Integer> p = new Pair<>("Ali", 20);
        System.out.println(p);
        System.out.println(p.swap());

        // ---- الدوال العامة
        GenericMethods.main(args);

        // ---- الواجهة العامة
        Converter<String, Integer> c = new LengthConverter();
        System.out.println(c.convert("Generics"));
    }
}

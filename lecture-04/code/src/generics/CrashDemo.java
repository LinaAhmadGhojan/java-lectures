package generics;

/**
 * يظهر لنا خطر Object: البرنامج يُترجم بلا أي خطأ، ثم ينهار أثناء التشغيل.
 */
public class CrashDemo {
    public static void main(String[] args) {
        ObjectBox box = new ObjectBox("Java");        // خزّنا نصاً
        System.out.println("Stored: " + box.get());
        Integer number = (Integer) box.get();         // طلبنا عدداً: المترجم يسكت!
        System.out.println(number + 1);
    }
}

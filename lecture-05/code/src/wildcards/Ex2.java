package wildcards;

public class Ex2 {
    static void show(Box<?> b) {
        Object o = b.get();
        // b.set("x");  // compile error
        System.out.println("Box contains: " + o);
    }
    public static void main(String[] args) {
        Box<String> s = new Box<>("Java");
        Box<Integer> n = new Box<>(42);
        show(s);
        show(n);
    }
}

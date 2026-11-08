package wildcards;

public class Ex6 {
    static <T extends Animal> void printName(T a) {
        System.out.println(a.name);
    }
    static <T extends Animal> T first(T a, T b) {
        return a;
    }
    public static void main(String[] args) {
        Dog d1 = new Dog("Rex");
        Dog d2 = new Dog("Max");
        printName(d1);
        Dog d = first(d1, d2);
        System.out.println(d.name);
        // printName("text");  // error
    }
}

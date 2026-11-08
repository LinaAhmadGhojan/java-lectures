package wildcards;

public class Ex5 {
    static void copy(Box<? extends Animal> from,
                     Box<? super Animal> to) {
        to.set(from.get());
    }
    public static void main(String[] args) {
        Box<Dog> source = new Box<>(new Dog("Rex"));
        Box<Animal> t1 = new Box<>(null);
        Box<Object> t2 = new Box<>(null);
        copy(source, t1);
        copy(source, t2);
        System.out.println(t1.get().name);
        // copy(t1, source);  // error
    }
}

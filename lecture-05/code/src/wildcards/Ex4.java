package wildcards;

public class Ex4 {
    static void addDog(Box<? super Dog> b) {
        b.set(new Dog("Max"));
    }
    public static void main(String[] args) {
        Box<Dog> bd = new Box<>(null);
        Box<Animal> ba = new Box<>(null);
        Box<Object> bo = new Box<>(null);
        addDog(bd);
        addDog(ba);
        addDog(bo);
        System.out.println(bd.get().name);
        System.out.println(ba.get().name);
        // addDog(new Box<Cat>(null));  // error
    }
}

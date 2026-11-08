package wildcards;

public class Ex3 {
    static void printName(Box<? extends Animal> b) {
        Animal a = b.get();
        System.out.println(a.name);
    }
    public static void main(String[] args) {
        Box<Dog> d = new Box<>(new Dog("Rex"));
        Box<Cat> c = new Box<>(new Cat("Tom"));
        Box<Animal> g = new Box<>(new Animal("Generic"));
        printName(d);
        printName(c);
        printName(g);
        // printName(new Box<String>("x"));  // error
    }
}

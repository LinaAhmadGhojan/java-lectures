package wildcards;

public class Ex1 {
    public static void main(String[] args) {
        Animal a = new Dog("Rex");
        Box<Dog> bd = new Box<>(new Dog("Rex"));
        // Box<Animal> ba = bd;  // compile error
        System.out.println(a.name);
        System.out.println(bd.get().name);
    }
}

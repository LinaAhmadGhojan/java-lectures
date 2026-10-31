package generics;

/**
 * صندوق عام: نكتبه مرة واحدة، ونحدد نوع ما بداخله عند الاستعمال.
 * T اسم مؤقت يحجز مكان النوع (Type Parameter).
 */
public class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }
}

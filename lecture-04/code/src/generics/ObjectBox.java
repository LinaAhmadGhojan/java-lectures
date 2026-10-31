package generics;

/**
 * الحل القديم: صندوق يقبل أي شيء لأنه يخزّن Object.
 */
public class ObjectBox {
    private Object value;

    public ObjectBox(Object value) {
        this.value = value;
    }

    public Object get() {
        return value;
    }

    public void set(Object value) {
        this.value = value;
    }
}

package generics;

/**
 * زوج: قيمتان قد تكونان من نوعين مختلفين.
 * K اسم الأولى (Key)، و V اسم الثانية (Value).
 */
public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // نرجع زوجاً جديداً بالترتيب المعكوس: لذلك نوعه Pair<V, K>
    public Pair<V, K> swap() {
        return new Pair<>(value, key);
    }

    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
    }
}

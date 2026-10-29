package restaurant;

/**
 * واجهة: "يدفع مالاً". كل صف ينفّذها يتعهد أن يعرف كيف يدفع مبلغاً.
 */
public interface Payer {
    void pay(int amount);
}

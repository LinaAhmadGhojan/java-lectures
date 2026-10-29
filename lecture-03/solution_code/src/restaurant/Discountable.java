package restaurant;

/**
 * واجهة: "عليه تخفيض". كل صف ينفّذها يتعهد أن يعرف سعره بعد التخفيض.
 */
public interface Discountable {
    int priceAfterDiscount();
}

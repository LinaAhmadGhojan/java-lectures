package restaurant;

/**
 * شوربة: صنف في القائمة (وراثة) ويقبل التخفيض (واجهة Discountable).
 */
public class Soup extends MenuItem implements Discountable {
    private int ml;

    public Soup(String name, int price, int ml) {
        super(name, price);
        this.ml = ml;
    }

    @Override
    public String toString() {
        return "Soup: " + getName() + " (" + ml + " ml, " + getPrice() + "$)";
    }

    @Override
    public int priceAfterDiscount() {
        return getPrice() * 80 / 100;       // تخفيض 20%
    }
}

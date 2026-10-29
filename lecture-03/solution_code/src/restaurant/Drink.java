package restaurant;

/**
 * مشروب: صنف في القائمة، ويمكن تخفيض سعره (ينفّذ Discountable).
 */
public class Drink extends MenuItem implements Discountable, Vegetarian {
    private int ml;

    public Drink(String name, int price, int ml) {
        super(name, price);
        this.ml = ml;
    }

    @Override
    public String toString() {
        return "Drink: " + getName() + " (" + ml + " ml, " + getPrice() + "$)";
    }

    @Override
    public boolean isVegetarian() {
        return true;
    }

    @Override
    public int priceAfterDiscount() {
        return getPrice() * 90 / 100;       // تخفيض 10%
    }
}

package restaurant;

/**
 * حلوى: صنف في القائمة، ويمكن تخفيض سعرها (ينفّذ Discountable).
 */
public class Dessert extends MenuItem implements Discountable {
    private int calories;

    public Dessert(String name, int price, int calories) {
        super(name, price);
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Dessert: " + getName() + " (" + calories + " cal, " + getPrice() + "$)";
    }

    @Override
    public int priceAfterDiscount() {
        return getPrice() * 80 / 100;       // تخفيض 20%
    }
}

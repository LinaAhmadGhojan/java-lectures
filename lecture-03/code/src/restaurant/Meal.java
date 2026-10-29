package restaurant;

/**
 * وجبة: صنف في القائمة، ولا يمكن تخفيض سعرها (لا تنفّذ Discountable).
 */
public class Meal extends MenuItem {
    private int grams;

    public Meal(String name, int price, int grams) {
        super(name, price);
        this.grams = grams;
    }

    @Override
    public String toString() {
        return "Meal: " + getName() + " (" + grams + " g, " + getPrice() + "$)";
    }
}

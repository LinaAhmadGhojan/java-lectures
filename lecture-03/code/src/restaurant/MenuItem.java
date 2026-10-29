package restaurant;

/**
 * صنف في القائمة (صف مجرد): ما تشترك فيه الوجبة والمشروب والحلوى.
 */
public abstract class MenuItem {
    private String name;
    private int price;

    public MenuItem(String name, int price) {
        this.name = name;
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price >= 0 ? price : 0;      // السعر لا يكون سالباً
    }
}

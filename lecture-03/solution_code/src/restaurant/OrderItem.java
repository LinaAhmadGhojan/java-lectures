package restaurant;

/**
 * عنصر الطلب: صنف واحد من القائمة وكميته. لا معنى له بدون طلبه، ولذلك يبنيه الطلب بنفسه (تركيب).
 * أما الصنف داخله (menuItem) فمجرد إشارة إلى صنف موجود في القائمة قبل الطلب.
 */
public class OrderItem {
    private MenuItem menuItem;
    private int quantity;

    public OrderItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public int subtotal() {
        return menuItem.getPrice() * quantity;
    }
}

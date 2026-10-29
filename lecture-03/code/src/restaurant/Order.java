package restaurant;

import java.util.ArrayList;

/**
 * الطلب.
 * تركيب (Composition): عناصر الطلب تُبنى داخله بـ new (في addItem)، ولا معنى لها بدونه.
 * تجميع (Aggregation): الزبون يأتي من الخارج (بالبنّاء)، وهو موجود قبل الطلب ويبقى بعده.
 */
public class Order {
    private Customer customer;                                    // تجميع
    private ArrayList<OrderItem> items = new ArrayList<>();       // تركيب

    public Order(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    // الطلب هو من يبني العنصر (new داخل التابع) = تركيب
    public void addItem(MenuItem menuItem, int quantity) {
        items.add(new OrderItem(menuItem, quantity));
    }

    public ArrayList<OrderItem> getItems() {
        return items;
    }

    public int total() {
        int sum = 0;
        for (OrderItem orderItem : items) {
            sum += orderItem.subtotal();
        }
        return sum;
    }
}

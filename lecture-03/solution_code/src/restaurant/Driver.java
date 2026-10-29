package restaurant;

/**
 * موصّل: موظف يوصّل الطلبات.
 * ارتباط (Association): الزبون والطلب يأتيان وسيطين لتابع deliver فقط،
 * ولا يحتفظ الموصّل بهما كخصائص. يتعاملان لحظياً ولا يملك أحدهما الآخر.
 */
public class Driver extends Employee implements Tippable {

    public Driver(String name, String phone, String email, int salary) {
        super(name, phone, email, salary);
    }

    @Override
    public void tip(int amount) {
        System.out.println(getName() + " got a tip of " + amount + "$");
    }

    @Override
    public String toString() {
        return "Driver: " + getName() + " (" + getPhone() + ", " + getEmail() + ", salary " + salary() + "$)";
    }

    public void deliver(Customer customer, Order order) {
        System.out.println(getName() + " delivers to " + customer.getName() + " at " + customer.getAddress()
                + " (call " + customer.getPhone() + ") an order of " + order.total() + "$");
    }
}

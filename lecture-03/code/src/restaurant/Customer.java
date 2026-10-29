package restaurant;

/**
 * زبون: شخص (وراثة) ويدفع مالاً (واجهة Payer). لا يُدفع له راتب: لا ينفّذ Payable.
 * له عنوان (للتوصيل) ونقاط ولاء تزيد نقطة عن كل 100$ يدفعها.
 */
public class Customer extends Person implements Payer {
    private String address;
    private int points;

    public Customer(String name, String phone, String email, String address) {
        super(name, phone, email);
        this.address = address;
        this.points = 0;
    }

    public String getAddress() {
        return address;
    }

    public int getPoints() {
        return points;
    }

    public boolean isVip() {
        return points >= 20;            // 20 نقطة أو أكثر = زبون مميز
    }

    @Override
    public String toString() {
        return "Customer: " + getName() + " (" + getPhone() + ", " + getEmail() + ", " + address + ", " + points + " points)";
    }

    @Override
    public void pay(int amount) {
        System.out.println(getName() + " pays " + amount + "$");
        points += amount / 100;         // نقطة عن كل 100$
    }
}

package restaurant;

/**
 * شيف: موظف يجهّز الطعام.
 */
public class Chef extends Employee implements Tippable {

    public Chef(String name, String phone, String email, int salary) {
        super(name, phone, email, salary);
    }

    @Override
    public void tip(int amount) {
        System.out.println(getName() + " got a tip of " + amount + "$");
    }

    @Override
    public String toString() {
        return "Chef: " + getName() + " (" + getPhone() + ", " + getEmail() + ", salary " + salary() + "$)";
    }
}

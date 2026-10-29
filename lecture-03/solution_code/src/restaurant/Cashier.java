package restaurant;

/**
 * محاسب: موظف. لا نكتب implements Payable لأنه يرثها من Employee.
 */
public class Cashier extends Employee {

    public Cashier(String name, String phone, String email, int salary) {
        super(name, phone, email, salary);
    }

    @Override
    public String toString() {
        return "Cashier: " + getName() + " (" + getPhone() + ", " + getEmail() + ", salary " + salary() + "$)";
    }
}

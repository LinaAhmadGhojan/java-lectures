package restaurant;

/**
 * شيف: موظف يجهّز الطعام.
 */
public class Chef extends Employee {

    public Chef(String name, String phone, String email, int salary) {
        super(name, phone, email, salary);
    }

    @Override
    public String toString() {
        return "Chef: " + getName() + " (" + getPhone() + ", " + getEmail() + ", salary " + salary() + "$)";
    }
}

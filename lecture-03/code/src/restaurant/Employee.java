package restaurant;

/**
 * موظف (صف مجرد): شخص (وراثة) ويُدفع له راتب (واجهة Payable).
 * الشيف والموصّل يرثان منه فيرثان الراتب والواجهة معاً.
 */
public abstract class Employee extends Person implements Payable {
    private int salary;

    public Employee(String name, String phone, String email, int salary) {
        super(name, phone, email);
        setSalary(salary);
    }

    public void setSalary(int salary) {
        this.salary = salary >= 0 ? salary : 0;      // الراتب لا يكون سالباً
    }

    @Override
    public int salary() {
        return salary;
    }
}

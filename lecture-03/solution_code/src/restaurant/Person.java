package restaurant;

/**
 * شخص (صف مجرد): ما يشترك فيه الزبون والموظف (الاسم ورقم الجوال والإيميل).
 */
public abstract class Person {
    private String name;
    private String phone;
    private String email;

    public Person(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        setEmail(email);
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email.contains("@") ? email : "no email";      // الإيميل الصحيح فيه @
    }
}

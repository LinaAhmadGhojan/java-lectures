package restaurant;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * مطعم: وراثة + واجهات + تعدد أشكال + تركيب + تجميع + ارتباط.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ---------------------------------------------------- 1) الأصناف (تعدد أشكال)
        ArrayList<MenuItem> menu = new ArrayList<>();
        System.out.println("How many menu items? ");
        int itemCount = input.nextInt();
        for (int i = 0; i < itemCount; i++) {
            int type;
            do {
                System.out.println("Item " + (i + 1) + ": 1 = Meal, 2 = Drink, 3 = Dessert, 4 = Soup");
                type = input.nextInt();
            } while (type < 1 || type > 4);

            System.out.println("Name: ");
            String name = input.next();
            System.out.println("Price: ");
            int price = input.nextInt();

            if (type == 1) {
                System.out.println("Grams: ");
                menu.add(new Meal(name, price, input.nextInt()));
            } else if (type == 2) {
                System.out.println("Ml: ");
                menu.add(new Drink(name, price, input.nextInt()));
            } else if (type == 3) {
                System.out.println("Calories: ");
                menu.add(new Dessert(name, price, input.nextInt()));
            } else {
                System.out.println("Ml: ");
                menu.add(new Soup(name, price, input.nextInt()));
            }
        }

        // ---------------------------------------------------- 2) الأشخاص (تعدد أشكال)
        ArrayList<Person> people = new ArrayList<>();
        System.out.println("How many people? ");
        int peopleCount = input.nextInt();
        for (int i = 0; i < peopleCount; i++) {
            int type;
            do {
                System.out.println("Person " + (i + 1) + ": 1 = Customer, 2 = Chef, 3 = Driver, 4 = Cashier");
                type = input.nextInt();
            } while (type < 1 || type > 4);

            System.out.println("Name: ");
            String name = input.next();
            System.out.println("Phone: ");
            String phone = input.next();
            System.out.println("Email: ");
            String email = input.next();
            if (type == 1) {
                System.out.println("Address: ");
                people.add(new Customer(name, phone, email, input.next()));
            } else {
                System.out.println("Salary: ");
                int salary = input.nextInt();
                if (type == 2) {
                    people.add(new Chef(name, phone, email, salary));
                } else if (type == 3) {
                    people.add(new Driver(name, phone, email, salary));
                } else {
                    people.add(new Cashier(name, phone, email, salary));
                }
            }
        }

        System.out.println("======== Menu ========");
        for (MenuItem item : menu) {
            System.out.println(item);
        }
        System.out.println("======== People ========");
        for (Person person : people) {
            System.out.println(person);
        }

        // ---------------------------------------------------- 3) واجهة Discountable
        System.out.println();
        System.out.println("======== Discounts ========");
        int notDiscountable = 0;
        for (MenuItem item : menu) {
            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                System.out.println(item.getName() + ": " + item.getPrice() + "$ -> " + d.priceAfterDiscount() + "$");
            } else {
                notDiscountable++;
            }
        }
        System.out.println("No discount: " + notDiscountable);

        // ---------------------------------------------------- واجهة Vegetarian
        System.out.println();
        System.out.println("======== Vegetarian ========");
        for (MenuItem item : menu) {
            if (item instanceof Vegetarian) {
                System.out.println("Vegetarian: " + item.getName());
            }
        }

        // ---------------------------------------------------- 4) واجهة Payable (رواتب)
        System.out.println();
        System.out.println("======== Salaries ========");
        int totalSalaries = 0;
        for (Person person : people) {
            if (person instanceof Payable) {
                Payable p = (Payable) person;
                System.out.println(person.getName() + ": " + p.salary() + "$");
                totalSalaries += p.salary();
            }
        }
        System.out.println("Total salaries: " + totalSalaries + "$");

        // ---------------------------------------------------- واجهة Tippable (بقشيش)
        System.out.println();
        System.out.println("======== Tips ========");
        ArrayList<Tippable> tippables = new ArrayList<>();
        for (Person person : people) {
            if (person instanceof Tippable) {
                tippables.add((Tippable) person);
            }
        }
        for (Tippable t : tippables) {
            t.tip(10);
        }

        // ---------------------------------------------------- 5) الطلب (تركيب + تجميع)
        Customer customer = null;
        Driver driver = null;
        for (Person person : people) {
            if (customer == null && person instanceof Customer) {
                customer = (Customer) person;
            }
            if (driver == null && person instanceof Driver) {
                driver = (Driver) person;
            }
        }
        if (customer == null || driver == null) {
            System.out.println("The order needs at least one customer and one driver");
            return;
        }

        System.out.println();
        System.out.println("======== Order ========");
        Order order = new Order(customer);                     // الزبون بُني خارج الطلب
        System.out.println("How many order items? ");
        int itemCount2 = input.nextInt();
        for (int i = 0; i < itemCount2; i++) {
            int number;
            do {
                System.out.println("Item number (1 to " + menu.size() + "): ");
                number = input.nextInt();
            } while (number < 1 || number > menu.size());
            System.out.println("Quantity: ");
            order.addItem(menu.get(number - 1), input.nextInt());   // الطلب يبني العنصر بنفسه
        }
        for (OrderItem orderItem : order.getItems()) {
            System.out.println(orderItem.getMenuItem().getName() + " x" + orderItem.getQuantity() + " = " + orderItem.subtotal() + "$");
        }
        System.out.println("Total: " + order.total() + "$");

        // ---------------------------------------------------- 6) واجهة Payer + ارتباط
        System.out.println();
        System.out.println("======== Payment and delivery ========");
        driver.deliver(customer, order);                       // ارتباط: وسيطان لتابع
        customer.pay(order.total());
        System.out.println(customer.getName() + " has " + customer.getPoints() + " points, VIP: " + customer.isVip());
    }
}

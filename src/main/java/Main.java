

import java.util.ArrayList;

public class Main {
    static ArrayList<Customer> customers = new ArrayList<>();
    static ArrayList<Item> items = new ArrayList<>();
    static ArrayList<Order> orders = new ArrayList<>();
    static ArrayList<Order> draft = new ArrayList<>();


    public static void congratulation(ArrayList<Customer> custArr) {
        for (Customer customer : custArr) {
            System.out.println(customer.getName() + " поздравляем с " + Holiday.NEWYEAR);
            if (customer.getGender() == Customer.Gender.MALE) {
                System.out.println(customer.getName() + " поздравляем с " + Holiday.MENSDAY);
            } else {
                System.out.println(customer.getName() + " поздравляем с " + Holiday.WOOMANSDAY);
            }
        }

    }

    static enum Holiday {NO, NEWYEAR, WOOMANSDAY, MENSDAY}

    public static void main(String[] args) throws Throwable {

        customers.add(new Customer("Ирина", 20, 123, Customer.Gender.FEMALE));
        customers.add(new Customer("Григорий", 21, 345, Customer.Gender.MALE));

        congratulation(customers);


        /*
        items.add(new Item("item1", 10));
        items.add(new Item("item2", 20));
        items.add(new Item("item3", 30));
        items.add(new Item("item4", 40));
        items.add(new Item("item5", 50));
        try {
            orders.add(placeOrder(customers.get(0),items.get(0), 5));
            orders.add(placeOrder(customers.get(1),items.get(1), 5));
            orders.add(placeOrder(customers.get(0),items.get(2), 5));
            orders.add(placeOrder(new Customer("new cust", 50, 456, Customer.Gender.FEMALE),items.get(0), 5));
            orders.add(placeOrder(customers.get(0),new Item("new item", 15), 5));
            orders.add(placeOrder(customers.get(0),items.get(2), -5));
        }
        catch (CustomerException | ProductException | AmountException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Orders length: " + orders.size());
        }

    }
    public static Order placeOrder(Customer customer, Item item, int quantity) throws Exception {
        if (!customers.contains(customer))
            throw new Exceptions.CustomerException("Customer not found");
        if(!items.contains(item))
            throw new Exceptions.ProductException("Item not found");
        if(quantity < 0)
            throw new Exceptions.AmountException("Incorrect amount " + quantity);
        return new Order(customer, item, quantity);
    */


    }
}


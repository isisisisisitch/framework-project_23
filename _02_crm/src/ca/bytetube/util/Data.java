package ca.bytetube.util;

import ca.bytetube.bean.Customer;

import java.util.LinkedList;
import java.util.List;

public class Data {

    private static final List<Customer> customers = new LinkedList<>();

    static {
        for (int i = 0; i < 8; i++) {
            customers.add(new Customer("dal" + i, 20 + i, 1.7 + i));
        }

    }

    public static void add(Customer customer) {
        customers.add(customer);
    }

    public static List<Customer> getCustomers() {
        return customers;
    }
}

package it.shifty.memory.escapingreferences;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        CustomerRecords records = new CustomerRecords();
        Customer customerA = new Customer();
        customerA.setName("A");
        Customer customerB = new Customer();
        customerB.setName("B");

        records.addCustomer(customerA);
        records.addCustomer(customerB);

        Map<String, Customer> myCustomers = records.getCustomers();
        myCustomers.clear();

    }
}

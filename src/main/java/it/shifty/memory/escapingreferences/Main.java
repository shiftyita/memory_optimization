package it.shifty.memory.escapingreferences;

public class Main {

    public static void main(String[] args) {
        CustomerRecords records = new CustomerRecords();

        records.addCustomer(new Customer("Simon"));
        records.addCustomer(new Customer("Paul"));

//        records.getCustomers().clear();

        for (Customer next : records.getCustomers().values()) {
            System.out.println(next);
        }
    }
}

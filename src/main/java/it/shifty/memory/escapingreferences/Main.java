package it.shifty.memory.escapingreferences;

public class Main {

    public static void main(String[] args) {
        CustomerRecords records = new CustomerRecords();

        records.addCustomer(new Customer("Simon"));
        records.addCustomer(new Customer("Paul"));

//        records.getCustomers().clear();
//        records.find("Simon").setName("Jane");

        ReadonlyCustomer c = records.find("Simon");
        Customer customer = (Customer) c;
        customer.setName("Jane");

        for (Customer next : records.getCustomers().values()) {
            System.out.println(next);
        }

        System.out.println(records.find("Simon"));

//        for (Customer next : records) {
//            System.out.println(next);
//        }
//
//        Iterator<Customer> it = records.iterator();
//        it.next();
//        it.remove();
//
//        for (Customer next : records) {
//            System.out.println(next);
//        }
    }
}

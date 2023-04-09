package it.shifty.main;

import it.shifty.escapingreferences.customers.CustomerRecords;
import it.shifty.escapingreferences.customers.ReadonlyCustomer;

public class Main {
    public static void main(String[] args) {
        CustomerRecords records = new CustomerRecords();

        records.addCustomer("John");
        records.addCustomer("Simon");

        for (ReadonlyCustomer c : records) {
            System.out.println(c);
        }

        records.find("John");
    }
}
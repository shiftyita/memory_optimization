package it.shifty.escapingreferences.customerimpl;

import it.shifty.escapingreferences.customers.ReadonlyCustomer;

public class Customer implements ReadonlyCustomer {

    public Customer(String name) {
        this.name = name;
    }

    public Customer(Customer c) { //copy object
        this.name = c.getName();
    }

    private String name;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName();
    }


}

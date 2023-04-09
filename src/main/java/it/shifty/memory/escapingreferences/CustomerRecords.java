package it.shifty.memory.escapingreferences;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecords implements Iterable<Customer> {

    private Map<String, Customer> records;

    public CustomerRecords() {
        this.records = new HashMap<>();
    }

    public void addCustomer(Customer c) {
        this.records.put(c.getName(), c);
    }

    public Map<String, Customer> getCustomers() {
        return Map.copyOf(records);
//        return Collections.unmodifiableMap(records);
    }

    @Override
    public Iterator<Customer> iterator() {
        return records.values().iterator();
    }

    public ReadonlyCustomer find(String name) {
        return new Customer(records.get(name));
    }

}

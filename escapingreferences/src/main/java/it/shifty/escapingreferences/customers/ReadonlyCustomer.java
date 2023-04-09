package it.shifty.escapingreferences.customers;

public interface ReadonlyCustomer {
    String getName();

    @Override
    String toString();
}

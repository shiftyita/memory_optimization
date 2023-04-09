package it.shifty.memory.escapingreferences;

public interface ReadonlyCustomer {
    String getName();

    @Override
    String toString();
}

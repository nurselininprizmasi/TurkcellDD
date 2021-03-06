package com.training.turkcell.structure.tests.decorator;

import com.training.turkcell.structure.tests.Customer;

public class CustomerHazretleriDecorator extends Customer {

    private Customer customer;

    public CustomerHazretleriDecorator(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String getName() {
        return this.customer.getName();
    }

    @Override
    public String getSurname() {
        return this.customer.getSurname() + " hazretleri";
    }

    @Override
    public String getGender() {
        return this.customer.getGender();
    }
}

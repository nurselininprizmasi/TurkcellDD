package com.training.turkcell.structure.tests.decorator;

import com.training.turkcell.structure.tests.Customer;

public class CustomerSayinDecorator extends Customer {
    private Customer customer;

    public CustomerSayinDecorator(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String getName() {
        return "Sayin " + customer.getName();
    }


    @Override
    public String getSurname() {
        return this.customer.getSurname();
    }

    @Override
    public String getGender() {
        return this.customer.getGender();
    }
}

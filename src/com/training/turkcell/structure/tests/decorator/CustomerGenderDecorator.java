package com.training.turkcell.structure.tests.decorator;

import com.training.turkcell.structure.tests.Customer;

public class CustomerGenderDecorator extends Customer {
    private Customer customer;

    public CustomerGenderDecorator(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String getName() {
        switch (this.customer.getGender()) {
            case "erkek":
                return "Bay " +this.customer.getName();
            case "kadın":
                return "Bayan " +this.customer.getName();
            default:
                return this.customer.getName();
        }
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

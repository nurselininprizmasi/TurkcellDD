package com.training.turkcell.structure.tests;

public class CustomerDAO {
    public void add(final Customer customer){
        System.out.println(customer.getName() +" "+ customer.getSurname()+" db yazma basarili\n");
    }
}

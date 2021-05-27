package com.training.turkcell.structure.tests.decorator;

import com.training.turkcell.structure.tests.Customer;
import com.training.turkcell.structure.tests.PrintSystem;

public class DecoratorRun {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("nursen");
        customer.setSurname("altinbas");
        customer.setGender("kadın");

        Customer customerNew = new CustomerSayinDecorator(customer);
        PrintSystem printSystem = new PrintSystem();
        printSystem.print(customerNew);

        Customer customerNew2 = new CustomerGenderDecorator(new CustomerSayinDecorator(customer));
        printSystem.print(customerNew2);

        Customer customerNew3 = new CustomerGenderDecorator(new CustomerSayinDecorator(new CustomerHazretleriDecorator(customer)));
        printSystem.print(customerNew3);
    }
}

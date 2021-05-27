package com.training.turkcell.structure.tests;

public class PrintSystem implements IPrintSystem{
    @Override
    public void print(Customer customer){
        System.out.println(customer.getName() +" " +customer.getSurname()+"\n");
    }
}

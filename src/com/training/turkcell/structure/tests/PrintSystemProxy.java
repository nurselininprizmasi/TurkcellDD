package com.training.turkcell.structure.tests;

public class PrintSystemProxy extends PrintSystem {
    @Override
    public void print(Customer customer) {
        System.out.println("musteri yaziliyor\n");
        super.print(customer);
        System.out.println("musteri yazildi\n");
    }
}

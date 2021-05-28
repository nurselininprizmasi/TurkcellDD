package com.training.turkcell.behavior.chainofresponsibilty;

public class CheckNotProc implements ICheckNumber {
    private ICheckNumber nextCheckNumber;

    public CheckNotProc() {

    }

    @Override
    public void check(int number) {
            System.out.println("sayi kurallara uymadi");

    }
}

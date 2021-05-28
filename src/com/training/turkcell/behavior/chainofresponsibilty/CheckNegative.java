package com.training.turkcell.behavior.chainofresponsibilty;

public class CheckNegative implements ICheckNumber {
    private ICheckNumber nextCheckNumber;

    public CheckNegative(ICheckNumber nextCheckNumber) {
        this.nextCheckNumber = nextCheckNumber;
    }

    @Override
    public void check(int number) {
        if (number < 0 ) {
            System.out.println("sayi negatif");
        } else {
            if (nextCheckNumber != null) {
                this.nextCheckNumber.check(number);
            }
        }

    }
}

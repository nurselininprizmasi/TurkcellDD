package com.training.turkcell.behavior.chainofresponsibilty;

public class CheckGreaterThan100 implements ICheckNumber {
    private ICheckNumber nextCheckNumber;

    public CheckGreaterThan100(ICheckNumber nextCheckNumber) {
        this.nextCheckNumber = nextCheckNumber;
    }

    @Override
    public void check(int number) {
        if (number > 100) {
            System.out.println("sayi 100 den buyuk");
        } else {
            if (nextCheckNumber != null) {
                this.nextCheckNumber.check(number);
            }
        }

    }
}

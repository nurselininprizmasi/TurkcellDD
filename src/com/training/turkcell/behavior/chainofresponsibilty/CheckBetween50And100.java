package com.training.turkcell.behavior.chainofresponsibilty;

public class CheckBetween50And100 implements ICheckNumber {
    private ICheckNumber nextCheckNumber;

    public CheckBetween50And100(ICheckNumber nextCheckNumber) {
        this.nextCheckNumber = nextCheckNumber;
    }

    @Override
    public void check(int number) {
        if (number >= 50 && number < 100) {
            System.out.println("sayi 50 ile 100 arasinda");
        } else {
            if (nextCheckNumber != null) {
                this.nextCheckNumber.check(number);
            }
        }

    }
}

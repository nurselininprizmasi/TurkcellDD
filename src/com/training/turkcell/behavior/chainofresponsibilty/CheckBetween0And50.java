package com.training.turkcell.behavior.chainofresponsibilty;

public class CheckBetween0And50 implements ICheckNumber {
    private ICheckNumber nextCheckNumber;

    public CheckBetween0And50(ICheckNumber nextCheckNumber) {
        this.nextCheckNumber = nextCheckNumber;
    }

    @Override
    public void check(int number) {
        if (number > 0 && number < 50) {
            System.out.println("sayi 0 ile 50 arasinda");
        } else {
            if (nextCheckNumber != null) {
                this.nextCheckNumber.check(number);
            }
        }

    }
}

package com.training.turkcell.behavior.strategy;

public class BadShooter extends Aim {
    int counter;

    @Override
    public void shoot() {
        counter++;
        if (counter % 10 == 0) {
            System.out.println("vurdum");
        } else {
            System.out.println("vuramadım");
        }
    }
}

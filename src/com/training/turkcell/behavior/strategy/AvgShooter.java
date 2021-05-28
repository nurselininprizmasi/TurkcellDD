package com.training.turkcell.behavior.strategy;

public class AvgShooter extends Aim {
    private int count;

    @Override
    public void shoot() {
        count++;
        if (count % 2 == 0) {
            System.out.println("vurdum");
        } else {
            System.out.println("vuramadım");
        }
    }
}

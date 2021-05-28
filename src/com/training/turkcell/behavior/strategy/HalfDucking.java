package com.training.turkcell.behavior.strategy;

public class HalfDucking extends Duck {
    int counter;

    @Override
    public void duck() {
        this.counter++;
        if (this.counter % 2 == 0) {
            System.out.println("*** vuruldum");
        } else {
            System.out.println("*** vurulmadım");
        }

    }
}

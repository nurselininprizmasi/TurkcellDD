package com.training.turkcell.behavior.strategy;

public class BadDucking extends Duck {
    int counter;

    @Override
    public void duck() {
        this.counter++;
        if (this.counter % 10 == 0) {
            System.out.println("*** vurulmadım ");
        } else {
            System.out.println("*** vuruldum");
        }

    }
}

package com.training.turkcell.behavior.observer;

public class ObserverRunner {
    public static void main(String[] args) {
        Executor executor = new Executor(ObserverFactory.createObserver());
        executor.run();
    }
}

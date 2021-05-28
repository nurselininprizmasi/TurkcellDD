package com.training.turkcell.behavior.observer;

public class Listener1 implements IListener {
    @Override
    public void phase1(String msg) {
        System.out.println("Listener1 Phase1: " +msg);
    }

    @Override
    public void phase2(String msg) {
        System.out.println("Listener1 Phase2: " +msg);
    }

    @Override
    public void phase3(String msg) {
        System.out.println("Listener1 Phase3: " +msg);
    }
}

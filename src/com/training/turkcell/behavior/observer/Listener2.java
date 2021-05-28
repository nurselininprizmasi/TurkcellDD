package com.training.turkcell.behavior.observer;

public class Listener2 implements IListener {
    @Override
    public void phase1(String msg) {
        System.out.println("Listener2 Phase1: " +msg);
    }

    @Override
    public void phase2(String msg) {
        System.out.println("Listener2 Phase2: " +msg);
    }

    @Override
    public void phase3(String msg) {
        System.out.println("Listener2 Phase3: " +msg);
    }
}

package com.training.turkcell.behavior.observer;

public class Executor {
    private IListener iListener;

    public Executor(IListener iListener) {
        this.iListener = iListener;
    }

    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        iListener.phase1("faz1 bitti");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        iListener.phase2("faz2 bitti");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        iListener.phase3("faz3 bitti");
    }
}

package com.training.turkcell.behavior.observer.test;

public class Siren implements IAlarm {
    @Override
    public void alarmOn(String msg) {
        System.out.println("Siren Calistir \n");
    }

    @Override
    public void alarmOff(String msg) {
        System.out.println("Siren durdur \n");
    }
}

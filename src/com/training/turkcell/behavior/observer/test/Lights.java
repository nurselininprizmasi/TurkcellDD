package com.training.turkcell.behavior.observer.test;

public class Lights implements IAlarm{
    @Override
    public void alarmOn(String msg) {
        System.out.println("Isiklari Ac \n");
    }

    @Override
    public void alarmOff(String msg) {
        System.out.println("Isiklari Kapat \n");
    }
}

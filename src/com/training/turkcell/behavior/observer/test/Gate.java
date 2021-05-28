package com.training.turkcell.behavior.observer.test;

public class Gate implements IAlarm{
    @Override
    public void alarmOn(String msg) {
        System.out.println("Dis Kapi Ac\n");
    }

    @Override
    public void alarmOff(String msg) {

    }
}

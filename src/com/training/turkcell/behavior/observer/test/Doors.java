package com.training.turkcell.behavior.observer.test;

public class Doors implements IAlarm {
    @Override
    public void alarmOn(String msg) {
        System.out.println("Kapilar Kilitlendi \n");
    }

    @Override
    public void alarmOff(String msg) {

    }
}

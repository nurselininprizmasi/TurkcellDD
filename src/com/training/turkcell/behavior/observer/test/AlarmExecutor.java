package com.training.turkcell.behavior.observer.test;

public class AlarmExecutor {
    private IAlarm iAlarm;

    public AlarmExecutor(IAlarm iAlarm) {
        this.iAlarm = iAlarm;
    }

    public AlarmExecutor() {

    }

    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        iAlarm.alarmOn("alarm devrede");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        iAlarm.alarmOff("alarm devre disi");
    }
}

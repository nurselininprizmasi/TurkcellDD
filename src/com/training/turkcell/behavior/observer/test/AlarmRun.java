package com.training.turkcell.behavior.observer.test;

public class AlarmRun {
    public static void main(String[] args) {
        AlarmObserver alarmObserver = new AlarmObserver();
        alarmObserver.addListener(new Lights());
        alarmObserver.addListener(new Doors());
        alarmObserver.addListener(new Gate());
        alarmObserver.addListener(new Siren());

        AlarmExecutor alarmExecutor = new AlarmExecutor(alarmObserver);
        alarmExecutor.run();
    }
}

package com.training.turkcell.behavior.observer.test;

import java.util.ArrayList;
import java.util.List;

public class AlarmObserver implements IAlarm {

    private List<IAlarm> alarms = new ArrayList<>();

    public void addListener(IAlarm iAlarm) {
        this.alarms.add(iAlarm);
    }

    @Override
    public void alarmOn(String msg) {
        for (IAlarm alarm : alarms) {
            alarm.alarmOn(msg);
        }
    }

    @Override
    public void alarmOff(String msg) {
        for (IAlarm alarm : alarms) {
            alarm.alarmOff(msg);
        }
    }
}

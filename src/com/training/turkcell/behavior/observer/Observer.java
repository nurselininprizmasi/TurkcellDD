package com.training.turkcell.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class Observer implements IListener{
    private List<IListener> listenerList = new ArrayList<>();

    public void addListener(IListener iListener){
        this.listenerList.add(iListener);
    }

    @Override
    public void phase1(String msg) {
        for(IListener listener:listenerList){
            listener.phase1(msg);
        }
    }

    @Override
    public void phase2(String msg) {
        for(IListener listener:listenerList){
            listener.phase2(msg);
        }
    }

    @Override
    public void phase3(String msg) {
        for(IListener listener:listenerList){
            listener.phase3(msg);
        }
    }
}

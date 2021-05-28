package com.training.turkcell.behavior.observer;

public class ObserverFactory {
    public static IListener createObserver(){
        Observer observer = new Observer();
        observer.addListener(new Listener1());
        observer.addListener(new Listener2());
        observer.addListener(new Listener3());
        return observer;
    }
}

package com.training.turkcell.behavior.state;

public class UpperState implements ICaseState {
    private StateSession stateSession;

    public UpperState(StateSession stateSession) {
        this.stateSession = stateSession;
    }

    @Override
    public void upper() {

    }

    @Override
    public void lower() {
        stateSession.setCurrentState(new LowerState(this.stateSession));
    }

    @Override
    public void print(String str) {
        System.out.println(str.toUpperCase());
    }
}

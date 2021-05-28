package com.training.turkcell.behavior.state;

public class LowerState implements ICaseState {
    private StateSession stateSession;

    public LowerState(StateSession stateSession) {
        this.stateSession = stateSession;
    }

    @Override
    public void upper() {
        stateSession.setCurrentState(new UpperState(this.stateSession));
    }

    @Override
    public void lower() {

    }

    @Override
    public void print(String str) {
        System.out.println(str.toLowerCase());
    }
}

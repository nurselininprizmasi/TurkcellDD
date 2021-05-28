package com.training.turkcell.behavior.state;

public class StateSession implements ICaseState {
    private ICaseState currentState = new LowerState(this);

    @Override
    public void upper() {
        this.currentState.upper();
    }

    @Override
    public void lower() {
        this.currentState.lower();
    }

    public ICaseState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(ICaseState currentState) {
        this.currentState = currentState;
    }

    @Override
    public void print(String str) {
        this.currentState.print(str);
    }
}

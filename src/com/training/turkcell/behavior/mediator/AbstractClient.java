package com.training.turkcell.behavior.mediator;

public abstract class AbstractClient implements IMsgListener {
    protected Mediator mediator;

    public AbstractClient(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.register(this);
    }
}

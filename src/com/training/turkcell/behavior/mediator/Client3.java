package com.training.turkcell.behavior.mediator;

public class Client3 extends AbstractClient {
    public Client3(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void messageReceived(String msg) {
        System.out.println("client3 received: " + msg);
    }

    @Override
    public String getName() {
        return this.getClass().getTypeName();
    }

    @Override
    public void sendMessage(String msg) {
        this.mediator.sendMesssage(msg);
    }
}

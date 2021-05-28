package com.training.turkcell.behavior.mediator;

public class Client2 extends AbstractClient {
    public Client2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void messageReceived(String msg) {
        System.out.println("client2 received: " + msg);
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

package com.training.turkcell.behavior.mediator;

public class MediatorRun {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Client1 client1 = new Client1(mediator);
        Client2 client2 = new Client2(mediator);
        Client3 client3 = new Client3(mediator);

        client2.sendMessage("hello from client2");
    }
}

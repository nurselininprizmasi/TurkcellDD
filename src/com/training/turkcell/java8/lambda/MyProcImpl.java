package com.training.turkcell.java8.lambda;

public class MyProcImpl implements IProc {
    private int port;

    public MyProcImpl(int port) {
        super();
        this.port = port;
    }

    @Override
    public void proc(String str) {
        System.out.println("output" + str);
    }
}

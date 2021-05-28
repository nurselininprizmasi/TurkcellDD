package com.training.turkcell.behavior.interceptor;

public class RunCommand implements IInterceptor {
    @Override
    public void intercept(String strParam) {
        String[] s = strParam.split(" ");
        System.out.println("RunCommand parametere :" + s[1]);
    }

    @Override
    public String getCommandStr() {
        return "run";
    }
}

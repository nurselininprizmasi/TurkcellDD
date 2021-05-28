package com.training.turkcell.behavior.interceptor;

public class DirCommand implements IInterceptor {
    @Override
    public void intercept(String strParam) {
        String[] s = strParam.split(" ");
        System.out.println("DirCommand parametere :" +s[1]);
    }

    @Override
    public String getCommanStr() {
        return "dir";
    }
}

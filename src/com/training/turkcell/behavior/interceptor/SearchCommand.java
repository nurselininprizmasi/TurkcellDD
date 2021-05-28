package com.training.turkcell.behavior.interceptor;

public class SearchCommand implements IInterceptor {
    @Override
    public void intercept(String strParam) {
        String[] s = strParam.split(" ");
        System.out.println("SearchCommand parametere :" +s[1]);
    }

    @Override
    public String getCommandStr() {
        return "search";
    }
}

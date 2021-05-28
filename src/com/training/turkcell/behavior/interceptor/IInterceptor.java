package com.training.turkcell.behavior.interceptor;

public interface IInterceptor {
    void intercept(String strParam);

    String getCommandStr();
}

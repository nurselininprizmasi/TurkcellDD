package com.training.turkcell.behavior.interceptor;

import java.util.Scanner;

public class InterceptorRunner {
    public static void main(String[] args) {
        Interceptor interceptor = new Interceptor();
        Scanner scanner = new Scanner(System.in);
        while (true){
            String s = scanner.nextLine();
            interceptor.intercept(s);
        }
    }}

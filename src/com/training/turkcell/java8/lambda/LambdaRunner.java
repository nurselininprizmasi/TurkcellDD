package com.training.turkcell.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaRunner {
    public static void main(final String[] args) {
        final int port = 80;
        IProc iProc = new MyProcImpl(port);
        iProc.proc("nursen");

        //anonim class, bu kısım için ayrıca class oluşturulur
        IProc iProc1 = new IProc() {
            @Override
            public void proc(String str) {
                System.out.println(port + "anonim output:" + str);
            }
        };
        iProc1.proc("hamdi");

        //lambda use tyoe 1 single parameter
        IProc lambdaProc = s -> System.out.println(port + "Lambda output" + s);
        lambdaProc.proc("güneş");

        //lambda use 1 double parameter
        IExec iExec = (x, y) -> "lambda output2 " + x + " " + y;
        iExec.exec("güneş", "altınbas");

        //lambda use type 2
        IExec iExec1 = (a, b) -> {
            if (a.length() > 10) {
                a = a.substring(1);
            }
            return a + b;
        };
        iExec1.exec("hamdi", "altinbas");

        //lambda use type 3
        IExec iExec2 = LambdaRunner::xyz;
        iExec2.exec("sen", "ben");

        //lambda use type 4
        LambdaRunner lambdaRunner = new LambdaRunner();
        IExec iExec3 = lambdaRunner::abc;
        iExec3.exec("anne", "baba");


        //lambda use type 5
        List<String> strs = Arrays.asList("aaa", "bbbbb", "cc", "dddddd", "eeee");
        List<Integer> list = strs.stream().filter(t -> t.length() > 2).map(y -> y.length()).collect(Collectors.toList());
    }

    public static String xyz(String str1, String str2) {
        if (str1.length() > 10) {
            str1 = str1.substring(1);
        }
        return str1 + str2;
    }

    public String abc(String str1, String str2) {
        if (str1.length() > 10) {
            str1 = str1.substring(1);
        }
        return str1 + str2;
    }
}

package com.training.turkcell.java8.intf;

public interface IMyInterface {
    String proc();

    default String helpProc(){
        System.out.println("help procdayım");
        String procLoc = proc();
        return procLoc.substring(1);
    }

    public static boolean isEmpty(String str){
        return str == null || str.isEmpty();
    }
}

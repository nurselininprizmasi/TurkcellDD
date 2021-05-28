package com.training.turkcell.behavior.chainofresponsibilty;

import java.util.Scanner;

public class CheckNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();

        ICheckNumber iCheckNumber = new CheckNegative(new CheckBetween0And50(new CheckBetween50And100(new CheckGreaterThan100(new CheckNotProc()))));
        iCheckNumber.check(nextInt);

//        if (nextInt > 0 && nextInt < 50) {
//            System.out.println("sayi 0 ile 50 arasinda");
//        } else if (nextInt >= 50 && nextInt < 100) {
//            System.out.println("sayi 50 ile 100 arasinda");
//        } else if (nextInt >= 100) {
//            System.out.println("sayi 100 den buyuk");
//        } else if (nextInt < 0) {
//            System.out.println("sayi negatif");
//        }
    }
}

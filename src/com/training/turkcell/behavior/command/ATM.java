package com.training.turkcell.behavior.command;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Musteri musteri = new Musteri();
        musteri.setName("nursen");
        musteri.setAmount(1000);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("1- para cek");
            System.out.println("2- para yatir");
            System.out.println("Seciminiz");

            int nextIntLoc = scanner.nextInt();
            switch (nextIntLoc) {
                case 1:
                    System.out.println("cekilecek miktar");
                    int deger = scanner.nextInt();
                    musteri.setAmount(musteri.getAmount() - deger);
                    break;
                case 2:
                    System.out.println("yatirilacak miktar");
                    int deger2 = scanner.nextInt();
                    musteri.setAmount(musteri.getAmount() + deger2);
                    break;
                default:
                    break;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

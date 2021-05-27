package com.training.turkcell.behavior.command;

import java.util.Scanner;

public class DepositeCommand implements IATMCommand{
    @Override
    public void execute(Scanner scanner, Musteri musteri) {
        System.out.println("yatirilacak miktar");
        int deger2 = scanner.nextInt();
        musteri.setAmount(musteri.getAmount() + deger2);
        System.out.println(musteri.getAmount());
    }

    @Override
    public String getDesc() {
        return "Para yatir";
    }
}

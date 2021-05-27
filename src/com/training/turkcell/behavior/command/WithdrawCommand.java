package com.training.turkcell.behavior.command;

import java.util.Scanner;

public class WithdrawCommand implements IATMCommand{

    @Override
    public void execute(Scanner scanner, Musteri musteri) {
        System.out.println("cekilecek miktar");
        int deger = scanner.nextInt();
        musteri.setAmount(musteri.getAmount() - deger);
        System.out.println(musteri.getAmount());
    }

    @Override
    public String getDesc() {
        return "Para Cek";
    }
}

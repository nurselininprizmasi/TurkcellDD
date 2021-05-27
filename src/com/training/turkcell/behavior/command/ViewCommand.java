package com.training.turkcell.behavior.command;

import java.util.Scanner;

public class ViewCommand implements IATMCommand{
    @Override
    public void execute(Scanner scanner, Musteri musteri) {
        System.out.println("Hesabiniz " + musteri);
    }

    @Override
    public String getDesc() {
        return "Hesabi Goruntule";
    }
}

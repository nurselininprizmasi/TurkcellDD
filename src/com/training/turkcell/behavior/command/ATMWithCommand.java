package com.training.turkcell.behavior.command;

import java.util.List;
import java.util.Scanner;

public class ATMWithCommand {
    public static void main(String[] args) {

        Musteri musteri = new Musteri();
        musteri.setName("nursen");
        musteri.setAmount(1000);

       List<IATMCommand> commands = CommandFactory.createCommand();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(musteri);
            int index = 1;
            for(IATMCommand iatmCommand : commands){
                System.out.println(index + "- "+iatmCommand.getDesc());
                index++;
            }

            System.out.println("Seciminiz");
            int nextIntLoc = scanner.nextInt();
            IATMCommand iatmCommand = commands.get(nextIntLoc-1);
            iatmCommand.execute(scanner,musteri);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

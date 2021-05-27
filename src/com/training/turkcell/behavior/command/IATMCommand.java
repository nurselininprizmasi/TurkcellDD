package com.training.turkcell.behavior.command;

import java.util.Scanner;

public interface IATMCommand {
    void execute(Scanner scanner,Musteri musteri);

    String getDesc();
}

package com.training.turkcell.behavior.command;

import java.util.ArrayList;
import java.util.List;

public class CommandFactory {
    public static List<IATMCommand> createCommand(){
        List<IATMCommand> commands = new ArrayList<>();
        commands.add(new WithdrawCommand());
        commands.add(new DepositeCommand());
        commands.add(new ViewCommand());
        return commands;
    }
}

package com.darkstars.command;

import com.darkstars.command.fx.Command;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {
    private List<Command> commands = new ArrayList<>();

    public void add(Command commmand){
        commands.add(commmand);
    }


    @Override
    public void execute() {
        for(var command : commands)
            command.execute();
    }
}

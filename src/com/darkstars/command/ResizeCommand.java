package com.darkstars.command;

import com.darkstars.command.fx.Command;

public class ResizeCommand implements Command {
    private CustomerService service;

    @Override
    public void execute() {
        System.out.println("Resizing... ");
    }
}

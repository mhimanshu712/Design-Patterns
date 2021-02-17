package com.darkstars.command;

import com.darkstars.command.fx.Command;

public class RemoveCustomerCommand implements Command {
    private CustomerService service;

    public RemoveCustomerCommand(CustomerService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.removeCustomer();
    }
}

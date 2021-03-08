package com.darkstars.ChainOfRes;

public class Logger extends Handler {

    public Logger(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("logging");
        return false;
    }
}

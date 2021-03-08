package com.darkstars.ChainOfRes;

public class Authenticator extends Handler{

    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        var isValid = (request.getUsername() == "admin" && request.getPassword() == "123");
        System.out.println("Auth done!");

        return !isValid;
    }
}

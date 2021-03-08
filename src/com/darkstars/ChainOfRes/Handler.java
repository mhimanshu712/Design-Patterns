package com.darkstars.ChainOfRes;

public abstract class Handler {
    private Handler next;

    protected Handler(Handler next) {
        this.next = next;
    }

    public void handle(HttpRequest request){
        if(doHandle(request))
            return;

        if(next != null)
            next.handle(request);
    }

    public abstract boolean doHandle(HttpRequest request);
}

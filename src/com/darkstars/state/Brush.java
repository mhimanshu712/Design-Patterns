package com.darkstars.state;

public class Brush extends Tool {

    @Override
    public void mouseUp() {
        System.out.println("Show brush icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Draw a path");
    }
}

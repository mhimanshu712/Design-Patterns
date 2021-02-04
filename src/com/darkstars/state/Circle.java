package com.darkstars.state;

public class Circle extends Tool {
    @Override
    public void mouseUp() {
        System.out.println("Show circle icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Draw a circle");
    }
}

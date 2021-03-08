package com.darkstars.visitor;

public class HighlightOperation implements Operation {
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("Highlight Heading");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("Highlight Anchor");
    }
}

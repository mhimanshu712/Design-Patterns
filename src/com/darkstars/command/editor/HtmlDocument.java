package com.darkstars.command.editor;

import com.darkstars.visitor.HighlightOperation;

public class HtmlDocument {
    private String content;

    public void makeBold(){
        content = "<b>" + content + "</b>";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void execute(HighlightOperation highlightOperation) {
    }
}

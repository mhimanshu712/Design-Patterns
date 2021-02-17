package com.darkstars.command.editor;

public interface UndoableCommand extends Command {
    void unexecute();
}

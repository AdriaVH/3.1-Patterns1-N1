package main;

import classes.Undo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Undo undo = Undo.getInstance();
        undo.add("cd ..");
        Undo undo2 = Undo.getInstance();
        
        if(args != null) {
            Arrays.stream(args).toList().forEach(undo::add);
        }
        undo2.displayCommands();
    }
}

package classes;

import java.util.ArrayList;
import java.util.List;

public class Undo {
    private final List<String> history = new ArrayList<String>();
    private Undo(){
    }
    private static class UndoHelper {
        private static final Undo INSTANCE = new Undo();
    }

    public static Undo getInstance(){
        return UndoHelper.INSTANCE;
    }
    public void add (String command) {
        history.add(command);
    }
    public void removeLast() {
        history.remove(history.size() - 1);
    }
    public void removeByIndex (int index) {
        history.remove(index);
    }
    public void displayCommands() {
        for (int i = 0; i < history.size(); i++) {
            System.out.println(i + " " + history.get(i));
        }
    }

    public List<String> listCommands (){
        return new ArrayList<String>(history);
    }
}

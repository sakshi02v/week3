package doubly_linkedlist.UndoRedo;

public class Main {
    public static void main(String[] args) {
        TextEditorHistory editorHistory = new TextEditorHistory();

        // Adding some initial states to the history of the text editor
        editorHistory.addState("Hello, World!");
        editorHistory.addState("Hello, World! This is the text editor.");
        editorHistory.addState("Hello, World! This is the text editor. Let's add more content.");
        editorHistory.addState("Hello, World! This is the text editor. Let's add more content. Undo/Redo functionality.");

        // Displaying the current state of the text
        editorHistory.displayCurrentState();

        // Performing Undo operations
        editorHistory.undo();
        editorHistory.undo();

        // Performing Redo operations
        editorHistory.redo();
        editorHistory.redo();

        // Adding more states to demonstrate the history size limit
        editorHistory.addState("New state added. History limit is 10.");
        editorHistory.addState("Another new state added. History limit ensures old states are removed.");

        // Displaying the current state after the new additions
        editorHistory.displayCurrentState();

        // Performing more Undo/Redo operations
        editorHistory.undo();
        editorHistory.redo();
    }
}
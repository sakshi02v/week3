package doubly_linkedlist.UndoRedo;

class TextEditorHistory {
    private TextState currentState;
    private int historySize;
    private final int MAX_HISTORY_SIZE = 10;

    // Constructor initializes the current state to null
    public TextEditorHistory() {
        currentState = null;
        historySize = 0;
    }

    // Adds a new text state to the history
    public void addState(String text) {
        // Create a new TextState for the current text
        TextState newState = new TextState(text);

        // If history is empty, set the first state
        if (currentState == null) {
            currentState = newState;
        } else {
            // Add the new state at the end of the list
            currentState.next = newState;
            newState.prev = currentState;
            currentState = newState;
        }

        // Maintain history size within the limit
        ensureHistorySize();
    }

    // Ensures that the history size does not exceed the maximum limit
    private void ensureHistorySize() {
        if (historySize < MAX_HISTORY_SIZE) {
            historySize++;
        } else {
            // Remove the oldest state if history size exceeds the limit
            removeOldestState();
        }
    }

    // Removes the oldest state from the history
    private void removeOldestState() {
        // Move to the first state in the history
        TextState oldestState = currentState.prev;

        // Disconnect the oldest state from the list
        if (oldestState != null) {
            oldestState.prev.next = null;
            historySize--;
        }
    }

    // Performs the undo operation (move to the previous state)
    public void undo() {
        if (currentState != null && currentState.prev != null) {
            currentState = currentState.prev;
            System.out.println("Undo: " + currentState.text);
        } else {
            System.out.println("No more states to undo.");
        }
    }

    // Performs the redo operation (move to the next state)
    public void redo() {
        if (currentState != null && currentState.next != null) {
            currentState = currentState.next;
            System.out.println("Redo: " + currentState.text);
        } else {
            System.out.println("No more states to redo.");
        }
    }

    // Displays the current state of the text in the editor
    public void displayCurrentState() {
        if (currentState != null) {
            System.out.println("Current Text: " + currentState.text);
        } else {
            System.out.println("No text available.");
        }
    }
}
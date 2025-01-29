package doubly_linkedlist.UndoRedo;


class TextState {
    String text;
    TextState next;
    TextState prev;

    // Constructor to initialize a new state with the text
    public TextState(String text) {
        this.text = text;
        this.next = null;
        this.prev = null;
    }
}
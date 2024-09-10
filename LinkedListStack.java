public class LinkedListStack implements myStack {
    private Node top;
    private int size;

    // Constructor
    public LinkedListStack() {
        top = null;
        size = 0;
    }

    @Override
    public void push(int item) {
        // TODO
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        // TODO
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        // TODO
    }

    @Override
    public boolean isEmpty() {
        // TODO
    }

    @Override
    public int size() {
        return size;
    }
}
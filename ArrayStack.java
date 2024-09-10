public class ArrayStack implements myStack {
    private int[] stackArray;
    private int top;
    private int capacity;

    // Constructor
    public ArrayStack(int size) {
        stackArray =  new int [size];
        capacity = size;
        top = -1;
    }

    @Override
    public void push(int item) {
        if (top == capacity - 1) {
            throw new StackOverflowError("Stack is full");
        }
        stackArray[++top] = item;

    }

    @Override
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stackArray[top--];
    }

    @Override
    public int   peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stackArray[top]; 
    }

    @Override
    public boolean isEmpty() {
        // TODO
    }

    @Override
    public int size() {
        // TODO
    }
}
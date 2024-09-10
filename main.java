public class main {
    public static void main(String[] args) {
        // Test Array-based Stack
        ArrayStack arrayStack = new ArrayStack(5);
        System.out.println("Testing Array-based Stack:");
        arrayStack.push(10);
        arrayStack.push(20);
        arrayStack.push(30);
        System.out.println("Top element: " + arrayStack.peek());
        System.out.println("Size: " + arrayStack.size());
        System.out.println("Popped element: " + arrayStack.pop());
        System.out.println("Is stack empty? " + arrayStack.isEmpty());

        // Test Linked List-based Stack
        LinkedListStack linkedListStack = new LinkedListStack();
        System.out.println("\nTesting Linked List-based Stack:");
        linkedListStack.push(100);
        linkedListStack.push(200);
        linkedListStack.push(300);
        System.out.println("Top element: " + linkedListStack.peek());
        System.out.println("Size: " + linkedListStack.size());
        System.out.println("Popped element: " + linkedListStack.pop());
        System.out.println("Is stack empty? " + linkedListStack.isEmpty());
    }
}
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=15834268&assignment_repo_type=AssignmentRepo)
# Implementing Stack ADT Using Arrays and Linked Lists in Java

### **Objective:**

- Understand the Stack Abstract Data Type (ADT) and its operations.
- Implement a stack using an array.
- Implement a stack using a linked list.
- Test and compare both implementations.

### **Prerequisites:**

- Basic knowledge of Java programming.
- Understanding of arrays, linked lists, and the stack ADT.

---

### **Lab Instructions:**

#### Part 1: Implementing Stack Using Arraysss

1. **Create a Stack Interface:**
   Define a `MyStack` interface with the following methods:

   ```java
   public interface MyStack {
       void push(int item);
       int pop();
       int peek();
       boolean isEmpty();
       int size();
   }
   ```

2. **Implement the Array-Based Stack:**

   Create a class `ArrayStack` that implements the `Stack` interface using an array.

   ```java
   public class ArrayStack implements MyStack {
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
       public int   peek() {
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
           // TODO
       }
   }
   ```

#### Part 2: Implementing Stack Using Linked Lists

1. **Node Class:**

   Create a `Node` class to represent a node in the linked list.

   ```java
   public class Node {
       int data;
       Node next;

       public Node(int data) {
           this.data = data;
           this.next = null;
       }
   }
   ```

2. **Implement the Linked List-Based Stack:**

   Create a class `LinkedListStack` that implements the `Stack` interface using a singly linked list.

   ```java
   public class LinkedListStack implements MyStack {
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
   ```

#### Part 3: Testing the Stack Implementations

1. **Create a Test Class:**

   In a `Main` class, write a `main` method to test both implementations.

   ```java
   public class Main {
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
   ```

2. **Run the Program:**
   - Compile and run your program.
   - Test both the array-based stack and linked list-based stack by pushing, popping, and checking the size of the stack.
   - Observe how each implementation handles stack operations.

---

### **Deliverables:**

1. A `Stack` interface.
2. Two stack implementations:
   - `ArrayStack` (using arrays).
   - `LinkedListStack` (using linked lists).

---

### **Questions to Answer:**

1. What are the advantages and disadvantages of implementing a stack using arrays compared to linked lists?  
   Answer: _Write your answer here._
2. What happens if you try to push an element into a full array-based stack? How can you handle this situation?  
   Answer: _Write your answer here._
3. Which implementation is more efficient in terms of time complexity for push and pop operations? Explain.  
   Answer: _Write your answer here._
4. What is the output of the main method in the test class?  
   Answer: _Write your answer here._

---

### **Grading Criteria:**

- Correctness of the stack implementations (Array-based and Linked list-based).
- Proper handling of edge cases (e.g., stack overflow, underflow).
- Correct execution of the test cases.

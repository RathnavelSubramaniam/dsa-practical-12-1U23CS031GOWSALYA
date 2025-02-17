import java.util.*;

public class LinkedStack {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top;

    LinkedStack() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("STACK UNDERFLOW! No elements to pop.");
            return -1; // Indicating empty stack
        }
        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }

    public void displayStack() {
        if (isEmpty()) {
            System.out.println("STACK IS EMPTY!");
            return;
        }
        Node current = top;
        System.out.print("Stack: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        Scanner scanner = new Scanner(System.in);
        int ch, data;

        System.out.println("ENTER INTEGERS TO CREATE NODES (ENTER A NON-INTEGER TO EXIT):");

        while (scanner.hasNextInt()) {
            data = scanner.nextInt();
            stack.push(data);
        }
        scanner.next(); // Consume non-integer input

        System.out.println("STACK USING LINKED LIST HAS BEEN CREATED");
        stack.displayStack();

        do {
            System.out.println("\n1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. EXIT");
            System.out.print("ENTER YOUR CHOICE: ");
            ch = scanner.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("ENTER THE ELEMENT TO PUSH INTO STACK: ");
                    data = scanner.nextInt();
                    stack.push(data);
                    System.out.println("STACK ELEMENTS AFTER PUSH OPERATION:");
                    stack.displayStack();
                    break;
                case 2:
                    data = stack.pop();
                    if (data != -1) {
                        System.out.println("POPPED ELEMENT IS: " + data);
                        System.out.println("STACK ELEMENTS AFTER POP OPERATION:");
                        stack.displayStack();
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("INVALID CHOICE! TRY AGAIN.");
            }
        } while (ch != 3);

        scanner.close();
    }
}

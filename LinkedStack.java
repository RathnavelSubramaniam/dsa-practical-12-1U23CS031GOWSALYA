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
    LinkedStack() 
    { 
        this.top = null; 
        
    }
    public boolean isEmpty()
    {
        return top==null;
        // TYPE YOUR CODE HERE
    }
    public void push(int data) 
    {
        Node newNode=new Node(data);
        if(top==null){top=newNode;}
        else{
            newNode.next=top;
            top=newNode;
         // TYPE YOUR CODE HERE  
        }  
}
    public int pop() 
    {
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return -1;}
        else{
            int returnVal=top.data;
            Node temp=top.next;
            top.next=null;
            top=temp;
            return returnVal;
        }
        // TYPE YOUR CODE HERE
    }
     public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int ch,data, c;
        System.out.println("ENTER INTEGERS TO CREATE NODES (ENTER A NON-INTEGER TO EXIT):");
        while (scanner.hasNext()) {
        if(scanner.hasNextInt())
          {
       data = scanner.nextInt();
       stack.push(data);
        }
        else{
          String temp=scanner.next();
          System.out.println("STACK USING LINKED LIST HAS BEEN CREATED");
          stack.displayStack();
do
{
    System.out.println("1.PUSH");
    System.out.println("2.POP");
    System.out.println("3.EXIT");
    System.out.println("ENTER YOUR CHOICE:"); 
    ch= scanner.nextInt();
    switch(ch)
    {
        case 1: 
            System.out.println("ENTER THE ELEMENT TO PUSH INTO STACK:");
            data=scanner.nextInt();
            stack.push(data);
            System.out.println("STACK ELEMENTS AFTER PUSH OPERATION ARE:");
            stack.displayStack();
            break;
        case 2:
            data=stack.pop();
            if(data!=-1)
            {
            System.out.println("POPPED ELEMENT IS:"+data);
            System.out.println("STACK ELEMENTS AFTER POP");
            stack.displayStack();
            }
            break;
            case 3:
            System.exit(0);
            }}while(ch<3);
        }
}
scanner.close();
}
public void displayStack() {
        Node current = top;
        while (current != null) {
        System.out.print(current.data + " -> ");
        current = current.next;
    }
    System.out.println("null");
}
}
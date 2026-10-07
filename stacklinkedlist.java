
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class Stack {
    Node top = null;

    void push(int data) {
        Node newnode = new Node(data);
        newnode.next = top;
        top = newnode;
    }

    void display() {
        if (top == null) {
            System.out.println("Empty");
            return;
        }
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    int pop() {
        if (top == null) {
            System.out.println("Empty");
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    int peek() {
        if (top == null) {
            System.out.println("Empty");
            return -1;
        }
        return top.data;
    }

    boolean isEmpty() {
        return top == null;
    }

}

public class stacklinkedlist {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.display();
        System.out.println("removed: " + stack.pop());
        System.out.println("Top: " + stack.peek());
        System.out.println("Empty: " + stack.isEmpty());
    }
}

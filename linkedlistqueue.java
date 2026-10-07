class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    Node front = null;
    Node rear = null;

    // Insert
    void enqueue(int data) {
        Node newnode = new Node(data);

        if (front == null) {
            front = newnode;
            rear = newnode;
            return;
        }

        rear.next = newnode;
        rear = newnode;
    }

    // Remove
    void dequeue() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Deleted: " + front.data);

        front = front.next;

        // If queue becomes empty
        if (front == null) {
            rear = null;
        }
    }

    // View first element
    void peek() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Front: " + front.data);
    }

    // Display
    void display() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }

        Node temp = front;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class linkedlistqueue {
    public static void main(String[] args) {

        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display();

        queue.peek();

        queue.dequeue();

        queue.display();

        queue.peek();
    }
}
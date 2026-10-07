class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class circularqueuell {

    Node front = null;
    Node rear = null;

    // Enqueue
    void enqueue(int data) {
        Node newNode = new Node(data);

        if (front == null) {
            front = newNode;
            rear = newNode;
            rear.next = front;
        } else {
            rear.next = newNode;
            rear = newNode;
            rear.next = front;
        }
    }

    // Dequeue
    void dequeue() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Deleted: " + front.data);

        if (front == rear) {
            front = null;
            rear = null;
        } else {
            front = front.next;
            rear.next = front;
        }
    }

    // Peek
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

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != front);

        System.out.println();
    }

    public static void main(String[] args) {

        circularqueuell queue = new circularqueuell();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println("Queue:");
        queue.display();

        queue.peek();

        queue.dequeue();

        System.out.println("After Dequeue:");
        queue.display();

        queue.peek();

        queue.enqueue(50);
        queue.enqueue(60);

        System.out.println("After Enqueue:");
        queue.display();
    }
}

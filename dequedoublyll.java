class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class dequedoublyll {
    Node front = null;
    Node rear = null;

    void insertfront(int data) {
        Node newnode = new Node(data);
        if (front == null) {
            front = rear = newnode;
        } else {
            newnode.next = front;
            front.prev = newnode;
            front = newnode;
        }
    }

    void insertrear(int data) {
        Node newnode = new Node(data);
        if (rear == null) {
            front = rear = newnode;
        } else {
            rear.next = newnode;
            newnode.prev = rear;
            rear = newnode;
        }
    }

    void deletefront() {
        if (front == null) {
            System.out.println("Empty");
            return;
        }

        System.out.println("Deleted: " + front.data);
        if (front == rear) {
            front = rear = null;
            return;
        }
        front = front.next;
        front.prev = null;

    }

    void deleterear() {
        if (front == null) {
            System.out.println("Empty");
            return;
        }
        System.out.println("Deleted: " + rear.data);
        if (front == rear) {
            front = null;
            rear = null;
            return;
        }
        rear = rear.prev;
        rear.next = null;

    }

    void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        dequedoublyll queue = new dequedoublyll();
        queue.insertfront(10);
        queue.insertfront(20);
        queue.insertrear(30);
        queue.display();
        queue.deletefront();
        queue.deleterear();
        queue.display();

    }

}

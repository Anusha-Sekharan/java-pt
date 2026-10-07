class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;

    }
}

public class pqll {
    Node front = null;

    void insert(int data) {
        Node newnode = new Node(data);
        if (front == null) {
            front = newnode;
            return;
        }
        if (data < front.data) {
            newnode.next = front;
            front = newnode;
            return;
        }
        Node temp = front;
        while (temp.next != null && temp.next.data < data) {
            temp = temp.next;

        }

        newnode.next = temp.next;
        temp.next = newnode;
    }

    void delete() {
        if (front == null) {
            System.out.println("Empty");
            return;
        }
        System.out.println("Deleted: " + front.data);
        front = front.next;

    }

    void display() {
        if (front == null) {
            System.out.println("Empty");
            return;
        }
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        pqll pq = new pqll();
        pq.insert(10);
        pq.insert(20);
        pq.insert(15);
        pq.display();
        pq.delete();
        pq.display();
    }
}

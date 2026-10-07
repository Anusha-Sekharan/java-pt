class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class singlylinkedlist {
    Node front = null;

    void insertfront(int data) {
        Node newnode = new Node(data);
        if (front == null) {
            front = newnode;
            return;
        }
        newnode.next = front;
        front = newnode;
    }

    void insertrear(int data) {
        Node newnode = new Node(data);
        if (front == null) {
            front = newnode;
            return;
        }
        Node temp = front;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    void insertposition(int data, int pos) {
        Node newnode = new Node(data);
        if (pos == 0) {
            newnode.next = front;
            front = newnode;
            return;
        }
        Node temp = front;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    void deletefront() {
        if (front == null) {
            System.out.println("Empty");
            return;
        }
        System.out.println("Deleted: " + front.data);
        front = front.next;
    }

    void deleterear() {
        if (front == null) {
            System.out.println("Empty");
            return;
        }
        if (front.next == null) {
            System.out.println("Deleted: " + front.data);
            front = null;
            return;
        }
        Node temp = front;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        System.out.println("Deleted: " + temp.next.data);
        temp.next = null;

    }

    void deleteposition(int pos) {
        if (front == null) {
            System.out.println("Empty");
            return;
        }
        if (pos == 0) {
            front = front.next;
            return;
        }
        Node temp = front;
        for (int i = 0; i < pos - 1; i++) {
            if (temp.next == null) {
                System.out.println("Invalid position");
                return;
            }
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Invalid position");
            return;
        }
        System.out.println("Deleted: " + temp.next.data);
        temp.next = temp.next.next;
    }

    void deletevalue(int data) {
        if (front == null) {
            System.out.println("Empty");
            return;
        }
        if (front.data == data) {
            front = front.next;
            return;
        }
        Node temp = front;
        while (temp.next != null) {
            if (temp.next.data == data) {
                System.out.println("Deleted: " + temp.next.data);
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;

        }
        System.out.println("Not found");
    }

    void reverse() {
        Node current = front;
        Node prev = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        front = prev;
    }

    void display() {
        Node temp = front;
        if (front == null) {
            System.out.println("Empty");
            return;

        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        singlylinkedlist ll = new singlylinkedlist();
        ll.insertfront(10);
        ll.insertrear(20);
        ll.insertposition(30, 1);
        ll.display();
        ll.deletefront();
        ll.deleterear();
        ll.deleteposition(0);
        ll.display();
        ll.insertfront(100);
        ll.display();
    }
}

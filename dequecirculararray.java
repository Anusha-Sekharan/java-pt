public class dequecirculararray {
    int[] arr;
    int capacity;
    int front;
    int rear;

    dequecirculararray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = -1;
        rear = -1;
    }

    void insertfront(int data) {
        if ((rear + 1) % capacity == front) {
            System.out.println("Full");
            return;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
            arr[front] = data;

        } else {
            front = ((front - 1 + capacity) % capacity);
        }
        arr[front] = data;
    }

    void insertrear(int data) {
        if ((rear + 1) % capacity == front) {
            System.out.println("Full");
            return;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
            arr[rear] = data;
        } else {
            rear = (rear + 1) % capacity;

        }
        arr[rear] = data;
    }

    void deletefront() {
        if (front == -1) {
            System.out.println("Empty");
            return;
        }
        int value = arr[front];
        System.out.println("Deleted: " + value);
        if (front == rear) {
            front = -1;
            rear = -1;

        } else {
            front = (front + 1) % capacity;

        }
    }

    void deleterear() {
        if (front == -1) {
            System.out.println("Empty");
            return;
        }
        int value = arr[rear];
        System.out.println("deleted: " + value);
        if (front == rear) {
            front = -1;
            rear = -1;

        } else {
            rear = (rear - 1 + capacity) % capacity;
        }
    }

    void display() {
        if (front == -1) {
            System.out.println("empty");
            return;
        }
        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear) {
                break;
            }
            i = (i + 1) % capacity;

        }
        System.out.println();

    }

    public static void main(String[] args) {
        dequecirculararray deque = new dequecirculararray(5);
        deque.insertfront(10);
        deque.insertrear(20);
        deque.insertrear(30);
        deque.display();
        deque.deleterear();
        deque.deletefront();
        deque.display();

    }

}

public class circularqueuearray {

    int[] arr;
    int capacity;
    int front;
    int rear;

    circularqueuearray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];

        front = -1;
        rear = -1;
    }

 
    void enqueue(int data) {


        if ((rear + 1) % capacity == front) {
            System.out.println("Queue is Full");
            return;
        }


        if (front == -1) {
            front = 0;
            rear = 0;
        } 
        else {
            rear = (rear + 1) % capacity;
        }

        arr[rear] = data;
    }


    void dequeue() {

        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Deleted: " + arr[front]);


        if (front == rear) {
            front = -1;
            rear = -1;
        } 
        else {
            front = (front + 1) % capacity;
        }
    }


    void peek() {

        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Front: " + arr[front]);
    }


    void display() {

        if (front == -1) {
            System.out.println("Queue is Empty");
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

        circularqueuearray queue = new circularqueuearray(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.display();

        queue.peek();

        queue.dequeue();

        queue.display();

        queue.peek();

        queue.enqueue(50);
        queue.enqueue(60);

        queue.display();
    }
}
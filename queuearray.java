public class queuearray {

    class QueueArray {

        int[] arr;
        int capacity;
        int rear, front;

        QueueArray(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            rear = -1;
            front = -1;
        }

        void enqueue(int data) {

            if (rear == capacity - 1) {
                System.out.println("Full");
                return;
            }

            if (front == -1) {
                front = 0;
            }

            rear++;
            arr[rear] = data;
        }

        int dequeue() {

            if (front == -1 || front > rear) {
                System.out.println("Empty");
                return -1;
            }

            return arr[front++];
        }

        int peek() {
            if (front == -1 || front > rear) {
                System.out.println("Empty");
                return -1;
            }
            return arr[front];
        }

        void display() {

            if (front == -1 || front > rear) {
                System.out.println("Empty");
                return;
            }

            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        queuearray obj = new queuearray();
        QueueArray queue = obj.new QueueArray(4);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display();

        System.out.println("Deleted: " + queue.dequeue());

        queue.display();
        System.out.println("Front: " + queue.peek());
    }
}
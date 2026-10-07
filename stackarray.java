public class stackarray {

    static class StackArray {

        int[] arr;
        int capacity;
        int top;

        StackArray(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            top = -1;
        }

        void push(int data) {
            if (top == capacity - 1) {
                System.out.println("Overflow");
                return;
            }

            top++;
            arr[top] = data;
        }

        int pop() {
            if (top == -1) {
                System.out.println("Empty Stack");
                return -1;
            }

            return arr[top--];
        }

        boolean isEmpty() {
            return top == -1;
        }

        boolean isFull() {
            return top == capacity - 1;
        }

        int peek() {
            if (top == -1) {
                System.out.println("Empty");
                return -1;
            }

            return arr[top];
        }

        void display() {
            if (top == -1) {
                System.out.println("Empty");
                return;
            }

            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        StackArray stack = new StackArray(5);

        stack.push(10);
        stack.push(20);

        stack.display();

        System.out.println("Popped: " + stack.pop());

        stack.display();

        System.out.println("Is Empty: " + stack.isEmpty());
        System.out.println("Is Full: " + stack.isFull());
        System.out.println("Peek: " + stack.peek());
    }
}
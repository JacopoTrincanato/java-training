package queue;

public class Queue {
    private int[] queue = new int[5];
    private int size;
    private int front;
    private int rear;

    public void enQueue(int data) {
        if (!isFull()) {
            this.queue[this.rear] = data;
            this.rear += 1 % 5;
            this.size += 1;
        } else {
            System.out.println("Queue is full");
        }
    }

    public void show() {
        System.out.println("Elements: ");
        for (int i = 0; i < size; i++) {
            System.out.println(this.queue[(this.front + i) % 5] + " ");
        }
        System.out.println();

        for (int n : this.queue) {
            System.out.println(n + " ");
        }
    }

    public int deQueue() {
        int data = this.queue[this.front];
        if (!isEmpty()) {
            this.front += 1 % 5;
            this.size -= 1;
        } else {
            System.out.println("Queue is empty");
        }

        return data;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean isFull() {
        return this.size == 5;
    }

    public int[] getQueue() {
        return this.queue;
    }

    public void setQueue(int[] queue) {
        this.queue = queue;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getFront() {
        return this.front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getRear() {
        return this.rear;
    }

    public void setRear(int rear) {
        this.rear = rear;
    }

}

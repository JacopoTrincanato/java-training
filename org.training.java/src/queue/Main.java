package queue;

public class Main {
    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.enQueue(5);
        queue.enQueue(4);
        queue.enQueue(3);
        queue.deQueue();
        queue.show();

        System.out.println(queue.getSize());
    }

}

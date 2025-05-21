package linkedlist;

public class Node {
    private int element;
    private Node next;

    public int getElement() {
        return this.element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return String.format("%s", this.element);
    }
}

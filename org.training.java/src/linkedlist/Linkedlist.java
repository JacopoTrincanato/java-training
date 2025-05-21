package linkedlist;

public class Linkedlist {
    private Node head;

    public Node getHead() {
        return this.head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void insert(int element) {
        Node node = new Node();
        node.setElement(element);
        node.setNext(null);

        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
        }
    }

    public void insertAtStart(int element) {
        Node node = new Node();
        node.setElement(element);
        node.setNext(head);
        head = node;
    }

    public void insertAt(int index, int element) {
        Node node = new Node();
        node.setElement(element);
        node.setNext(null);

        Node newNode = head;

        if (index == 0) {
            insertAtStart(element);
        } else {
            for (int i = 0; i < index - 1; i++) {
                newNode = newNode.getNext();
            }

            node.setNext(newNode.getNext());
            newNode.setNext(node);
        }
    }

    public void deleteAt(int index) {
        if (index == 0) {
            head = head.getNext();
        } else {
            Node newNode = head;
            for (int i = 0; i < index - 1; i++) {
                newNode = newNode.getNext();
            }

            Node toDelete = newNode.getNext();
            int deletedElement = toDelete.getElement();
            newNode.setNext(toDelete.getNext());

            System.out.println("deleted element: " + deletedElement);
        }

    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node current = head;
        while (current != null) {
            stringBuilder.append(current.getElement()).append("->");
            current = current.getNext();
        }

        return stringBuilder.toString();
    }

}

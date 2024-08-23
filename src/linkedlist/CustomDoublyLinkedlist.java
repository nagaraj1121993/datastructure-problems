package linkedlist;

public class CustomDoublyLinkedlist {

    private Node head;
    private Node tail;

    class Node {
        Object data;
        Node prev;
        Node next;
        public Node(Object data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void addBegin(Object object) {
        if(head == null) {
            head = new Node(object);
        } else {
            Node temp = head;
            head = new Node(object);
            temp.prev = head;
            head.next = temp;
        }
    }

    public void addEnd(Object object) {
        if(head == null) {
            head = new Node(object);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node newNode = new Node(object);
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public void removeBegin() {
        if(head == null) {
            throw new RuntimeException("LinkedList is empty");
        } else {
            Node temp = head;
            head = temp.next;
            head.prev = null;
        }
    }

    public void removeEnd() {
        if(head == null) {
            throw new RuntimeException("LinkedList is Empty");
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public void printList() {
        if(head == null) {
            System.out.println("No Elements in LinkedList");
        } else {
            while (head.next != null) {
                System.out.print(head.data + " ");
                head = head.next;
            }
        }
    }

}

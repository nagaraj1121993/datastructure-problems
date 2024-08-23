package linkedlist;

public class CustomLinkedList {

    private Node head;
    private Node tail;

    class Node {
        Node next;
        Object data;
        public Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }

    public CustomLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addBegin(Object object) {
        if(head == null) {
            head = new Node(object);
        } else {
            Node temp = head;
            head = new Node(object);
            head.next = temp;
        }
    }

    public void addEnd(Object object) {
        if(head == null) {
            Node temp = new Node(object);
            head = temp;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(object);
        }
    }

    public void removeBegin() {
        if(head == null) {
            throw new RuntimeException("LinkedList is empty");
        } else {
            Node temp = head.next;
            head = temp;
        }
    }

    public void removeLast() {
        if(head == null) {
            throw new RuntimeException("LinkedList is empty");
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}

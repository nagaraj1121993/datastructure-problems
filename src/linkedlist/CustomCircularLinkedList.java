package linkedlist;

public class CustomCircularLinkedList {

    class Node {
        Object data;
        Node next;
        Node prev;
        Node(Object data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public void addBeginSLL(Object object) {
        if(head == null) {
            head = new Node(object);
            head.next = head;
            tail = head;
        } else {
            Node temp = head;
            head = new Node(object);
            head.next = temp;
        }
    }

    public void addEndSLL(Object object) {
        if(head == null) {
            head = new Node(object);
            head.next = head;
            tail = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = new Node(object);
            tail = temp.next;
            temp.next.next = head;
        }
    }

    public void removeBeginSLL(Object object) {
        if(head == null) {
            throw new RuntimeException("LinkedList is empty");
        } else {
            Node temp = head;
            if(head.next == head) {
                head = null;
            } else {
                head = temp.next;
                tail.next = head;
            }
        }
    }

    public void removeEndSLL(Object object) {
        if(head == null) {
            throw new RuntimeException("LinkedList is empty");
        } else {
            Node temp = head;
            while (temp.next.next != head) {
                temp = temp.next;
            }
            temp.next = head;
            tail = temp;
            tail.next = head;
        }
    }

    public void printList() {
        Node temp = head;
        do {
            System.out.println(temp.data);
            temp = temp.next;
        } while (temp != head);
    }

}

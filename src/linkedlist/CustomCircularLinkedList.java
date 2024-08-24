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
            tail.next = head;
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

    public void removeBeginSLL() {
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

    public void removeEndSLL() {
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
        if(head == null) {
            throw new RuntimeException("LinkedList is empty");
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }

    public Node removeKthElement(int k) {
        if(getLength() < k) {
            throw new RuntimeException("Index greater than length");
        }
        Node temp = head;
        Node prev = null;
        Node next = null;
        int counter = 0;
        do {
            counter++;
            if(k == 1) {
                removeBeginSLL();
                break;
            }
            if(counter == k) {
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
        return head;
    }

    public Integer getLength() {
        Node temp = head;
        int size = 0;
        do {
            size++;
            temp = temp.next;
        } while (temp != head);
        return size;
    }

}

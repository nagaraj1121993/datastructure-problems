package linkedlist;

public class CustomLinkedListTest {

    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();
        linkedList.addEnd(12);
        linkedList.addEnd(32);
        linkedList.addEnd(52);
        linkedList.addEnd(72);
        linkedList.addEnd(92);
        System.out.println("ADD END");
        linkedList.printList();
//        linkedList.addBegin(122);
//        linkedList.addBegin(155);
//        System.out.println("ADD BEGIN");
//        linkedList.printList();
        linkedList.removeBegin();
        System.out.println("REMOVE BEGIN");
        linkedList.printList();
//        linkedList.removeLast();
//        System.out.println("REMOVE LAST");
//        linkedList.printList();
    }

}

package linkedlist;

public class CustomLinkedListTest {

    public static void main(String[] args) {
        CustomCircularLinkedList linkedList = new CustomCircularLinkedList();
        linkedList.addEndSLL(12);
//        linkedList.addEndSLL(32);
//        linkedList.addEndSLL(52);
//        linkedList.addEndSLL(72);
//        linkedList.addEndSLL(92);
        System.out.println("ADD END");
        linkedList.printList();
//        linkedList.addBeginSLL(122);
//        linkedList.addBeginSLL(155);
//        System.out.println("ADD BEGIN");
//        linkedList.printList();
//        System.out.println("PRINT REVERSING");
//        linkedList.reverseList();
//        System.out.println("ADD BEGIN");
//        linkedList.printList();
        linkedList.removeBeginSLL();
        System.out.println("REMOVE BEGIN");
        linkedList.printList();
//        linkedList.removeEndSLL();
//        System.out.println("REMOVE LAST");
//        linkedList.printList();
    }

}

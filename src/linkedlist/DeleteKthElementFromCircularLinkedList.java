package linkedlist;

public class DeleteKthElementFromCircularLinkedList {

    public static void main(String[] args) {
        CustomCircularLinkedList linkedList = new CustomCircularLinkedList();
        linkedList.addEndSLL(12);
        linkedList.addEndSLL(32);
        linkedList.addEndSLL(52);
        linkedList.addEndSLL(72);
        linkedList.addEndSLL(92);
//        linkedList.addBeginSLL(122);
//        linkedList.addBeginSLL(155);
        linkedList.printList();
        System.out.println("DELETE Kth");
        linkedList.removeKthElement(5);
        linkedList.printList();
    }

}

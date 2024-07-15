package Linkedlist;

public class ReverseLinkedList2 {
    public static void main(String[] args) {
        SingleLinkedList ll = new SingleLinkedList();
        for (int i = 0; i < 8; i++) {
            ll.insertLast(i);
        }
        ll.display();
        ll.reverseLinkedList2(2,4);
        ll.display();
    }
}

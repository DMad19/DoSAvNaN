package Linkedlist;

public class ReverseLinkedListRecursion {
    public static void main(String[] args) {
        SingleLinkedList ll = new SingleLinkedList();
        for (int i = 0; i < 6; i++) {
            ll.insertLast(i);
        }
        ll.display();
        ll.reverseLinkedList();
        ll.display();
    }
}

package Linkedlist;

public class ReverseLinkedListIteration {
    public static void main(String[] args) {
        SingleLinkedList ll = new SingleLinkedList();
        for (int i = 0; i < 8; i++) {
            ll.insertLast(i);
        }
        ll.display();
        ll.reverseLinkedListIteration();
        ll.display();
    }
}

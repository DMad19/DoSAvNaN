package Linkedlist;

public class Reorder {
    public static void main(String[] args) {
        SingleLinkedList ll = new SingleLinkedList();
        for (int i = 0; i < 5; i++) {
            ll.insertLast(i);
        }
        ll.display();
        ll.reorder();
        ll.display();
    }
}

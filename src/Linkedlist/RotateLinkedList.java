package Linkedlist;

public class RotateLinkedList {
    public static void main(String[] args) {
        SingleLinkedList ll = new SingleLinkedList();
        for (int i = 0; i < 6; i++) {
            ll.insertLast(i);
        }
        ll.display();
        ll.rotate(2);
        ll.display();
    }
}

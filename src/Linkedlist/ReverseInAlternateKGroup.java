package Linkedlist;

public class ReverseInAlternateKGroup {
    public static void main(String[] args) {
        SingleLinkedList ll = new SingleLinkedList();
        for (int i = 0; i < 6; i++) {
            ll.insertLast(i);
        }
        ll.display();
        ll.reverseInAlternateKGroup(2);
        ll.display();
    }
}

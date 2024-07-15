package Linkedlist;

public class BubbleSort {
    public static void main(String[] args) {
        SingleLinkedList ll = new SingleLinkedList();
        for (int i = 0; i < 8; i++) {
            ll.insertFirst(i);
        }
        ll.display();
        ll.bubbleSort();
        ll.display();
    }
}

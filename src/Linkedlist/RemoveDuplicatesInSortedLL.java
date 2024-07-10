package Linkedlist;

public class RemoveDuplicatesInSortedLL {
    public static void main(String[] args) {
        SingleLinkedList ll = new SingleLinkedList();
        ll.insertLast(1);
        ll.insertLast(1);
        ll.insertLast(1);
        ll.insertLast(2);
        ll.insertLast(2);
        ll.display();
        ll.removeDuplicates();
        ll.display();
    }
}
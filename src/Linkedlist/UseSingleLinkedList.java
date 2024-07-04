package Linkedlist;

public class UseSingleLinkedList {
    public static void main(String[] args) {
        SingleLinkedList sl = new SingleLinkedList();
        sl.insertFirst(4);
        sl.insertFirst(3);
        sl.insertFirst(2);
        sl.insertFirst(1);
        sl.insertLast(5);
        sl.insert(22,3);
        sl.display();
    }
}

package Linkedlist;

public class UseLinkedList {
    public static void main(String[] args) {
        /* Single Linked List
        SingleLinkedList sl = new SingleLinkedList();
        sl.insertFirst(4);
        sl.insertFirst(3);
        sl.insertFirst(2);
        sl.insertFirst(1);
        sl.insertLast(5);
        sl.insert(22,3);
        sl.display();
        System.out.println(sl.deleteFirst());
        sl.display();
        System.out.println(sl.deleteLast());
        sl.display();
        System.out.println(sl.delete(2));
        sl.display();
        */
        /* Doubly Linked List
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.insertLast(2);
        dl.insertFirst(4);
        dl.insertFirst(1);
        dl.insertLast(2333);
        dl.insert(0,0);
        dl.insert(1,11);
        dl.insert(7,44);
        dl.insertAfter(11,12);
        dl.display();
        */
        CircularLinkedList cl = new CircularLinkedList();
        cl.insert(1);
        cl.insert(2);
        cl.insert(3);
        cl.display();
        cl.delete(3);
        cl.display();
        cl.insert(4);
        cl.display();
    }
}

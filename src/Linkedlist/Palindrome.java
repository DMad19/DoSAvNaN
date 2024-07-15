package Linkedlist;

public class Palindrome {
    public static void main(String[] args) {
        SingleLinkedList ll = new SingleLinkedList();
        ll.insertLast(1);
        ll.insertLast(2);
        ll.insertLast(2);
        ll.insertLast(4);
        System.out.println(ll.isPalindrome());
    }
}

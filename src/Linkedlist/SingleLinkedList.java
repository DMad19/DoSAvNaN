package Linkedlist;

public class SingleLinkedList {
    private Node head;
    private Node tail;
    private int size;
    public SingleLinkedList(){
        this.size = 0;
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null) {
            tail = node;
        }
        size+=1;
    }
    public void insertLast(int value){
        if(tail==null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size+=1;
    }
    public void insert(int value,int index){
        if(index==0){
            insertFirst(value);
        }
        if(index==size){
            insertLast(value);
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(value,temp.next);
        temp.next = newNode;
        size+=1;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private class Node{
        private int value;
        private Node next;
        private Node(int value){
            this.value = value;
        }
        private Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }
}

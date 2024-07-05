package Linkedlist;

public class DoublyLinkedList {
    private Node head ;
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head!=null) {
            head.prev = node;
        }
        head = node;
    }
    public void display(){
        Node node = head;
        Node last = null;
        while(node!=null){
            System.out.print(node.value+"->");
            last = node;
            node = node.next;
        }
        System.out.println("END");
        while(last!=null){
            System.out.print(last.value+"->");
            last = last.prev;
        }
        System.out.println("START");
    }
    private class Node{
        private int value;
        private Node prev;
        private Node next;
        public Node(int value){
            this.value = value;
        }
        public Node(int value,Node prev,Node next){
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}

package Linkedlist;

public class CircularLinkedList {
    private Node head;
    private Node tail;
    public CircularLinkedList(){
        this.head = null;
        this.tail = null;
    }
    public void insert(int value){
        Node node = new Node(value);
        if(head==null){
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        tail.next = node;
        tail = node;
    }
    public void display(){
        Node temp = head;
        if(temp!=null){
            do{
                System.out.print(temp.value+"->");
                if (temp.next != null) {
                    temp = temp.next;
                }
            }while(temp!=head);
            System.out.println("HEAD");
        }
    }
    public void delete(int value){
        if(head==null){
            return;
        }
        if(head.value==value){
            head = head.next;
            tail.next = head;
            return;
        }
        Node node = head;
        do{
            Node nextNode = node.next;
            if(nextNode.value==value){
                node.next = nextNode.next;
                if(tail==nextNode){
                    tail=node;
                }
                return;
            }
            node = node.next;
        }while(node!=head);
    }
    private class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }
}

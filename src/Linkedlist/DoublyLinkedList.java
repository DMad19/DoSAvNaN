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
    public void insertLast(int value){
        Node node = new Node(value);
        if(head==null){
            insertFirst(value);
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        node.prev = temp;
        temp.next = node;
        node.next = null;
    }
    public void insert(int index,int value){
        Node node = new Node(value);
        if(index==0){
            insertFirst(value);
            return;
        }
        Node temp = head;
        if(head==null){
            insertFirst(value);
            return;
        }
        int count = 1;
        while(temp.next!=null){
            if(count == index){
                break;
            }
            temp = temp.next;
            count+=1;
        }
        if(temp.next==null){
            insertLast(value);
            return;
        }
        node.next = temp.next;
        node.prev = temp;
        temp.next = node;
        node.next.prev = node;
    }
    public void insertAfter(int after,int value){
        Node beforeNode = find(after);
        Node node = new Node(value);
        node.next = beforeNode.next;
        node.prev = beforeNode;
        beforeNode.next = node;
        if(node.next!=null) {
            node.next.prev = node;
        }
    }
    public Node find(int value){
        Node temp = head;
        while(temp!=null){
            if(temp.value==value){
                return temp;
            }
            temp = temp.next;
        }
        return null;
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

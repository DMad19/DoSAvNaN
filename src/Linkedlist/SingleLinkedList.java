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
    public void insertUsingRecusrion(int value,int index){
        head = insertUsingRecursion(value,index,head);
    }
    private Node insertUsingRecursion(int value,int index,Node curr){
        if(index==0){
            Node node = new Node(value,curr);
            size+=1;
            return node;
        }
        curr.next = insertUsingRecursion(value,index-1,curr.next);
        return curr;
    }
    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        if(tail==null){
            tail = head;
        }
        size-=1;
        return value;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        int value = tail.value;
        Node lastButOne = get(size-2);
        tail = lastButOne;
        lastButOne.next = null;
        size-=1;
        return value;
    }
    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node indexButOne = get(index-1);
        int value = indexButOne.next.value;
        indexButOne.next = indexButOne.next.next;
        size-=1;
        return value;
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
    public Node get(int index){
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp;
    }
    public void removeDuplicates(){
        head = removeDuplicates(head);
    }
    private Node removeDuplicates(Node head){
        Node node = head;
        if(node==null){
            return node;
        }
        while(node.next!=null){
            if(node.next.value==node.value){
                node.next = node.next.next;
                size-=1;
            }else{
                node = node.next;
            }
        }
        tail = node;
        return head;
    }
    public Node Node(Node head) {
        if(head==null || head.next==null){
            return head;
        }
        Node mid = findMid(head);
        Node l = Node(head);
        Node r = Node(mid);
        return merge(l,r);
    }
    public Node merge(Node f, Node s){
        Node head = new Node();
        Node temp = head;
        while(f!=null && s!=null){
            if(f.value<s.value){
                temp.next = f;
                temp = temp.next;
                f = f.next;
            }else{
                temp.next = s;
                temp = temp.next;
                s = s.next;
            }
        }
        if(f!=null){
            temp.next = f;
        }
        else{
            temp.next = s;
        }
        return head.next;
    }
    public Node findMid(Node head){
        Node f = head;
        Node s = head;
        Node prev = null;
        while(f!=null && f.next!=null){
            prev = s;
            f = f.next.next;
            s = s.next;
        }
        if (prev != null) {
            prev.next = null;
        }
        return s;
    }
    public Node findMiddle(){
        Node f = head;
        Node s = head;
        while(f!=null && f.next!=null){
            f = f.next.next;
            s = s.next;
        }
        return s;
    }
    public static Node mergeLL(Node f,Node s){
        SingleLinkedList newLL = new SingleLinkedList();
        Node first = f;
        Node second = s;
        while(first!=null && second!=null){
            if(first.value < second.value){
                newLL.insertLast(first.value);
                first = first.next;
            }else{
                newLL.insertLast(second.value);
                second = second.next;
            }
        }
        while(first!=null){
            newLL.insertLast(first.value);
            first = first.next;
        }
        while(second!=null){
            newLL.insertLast(second.value);
            second = second.next;
        }
        return newLL.head;
    }
    public boolean isCycleLinkedList(SingleLinkedList ll){
        Node fast = head;
        Node slow = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public int lengthOfCycle(SingleLinkedList ll){
        Node fast = head;
        Node slow = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast){
                int length = 0;
                do{
                    length+=1;
                    slow = slow.next;
                }while(slow!=fast);
                return length;
            }
        }
        return 0;
    }
    public Node CycleLinkedList2(SingleLinkedList ll){
        int length = lengthOfCycle(ll);
        if(length==0){
            return null;
        }
        Node first = head;
        Node second = head;
        while(length>0){
            second = second.next;
        }
        while(second!=first){
            first = first.next;
            second = second.next;
        }
        return first;
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
        public Node() {}
        private Node(int value){
            this.value = value;
        }
        private Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }
}

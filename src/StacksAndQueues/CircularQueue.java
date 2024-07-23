package StacksAndQueues;

public class CircularQueue {
    protected int[] data;
    protected int size = 0;
    protected int front = 0;
    protected int end = 0;
    private static final int DEFAULTSIZE = 5;
    public CircularQueue(){
        this(DEFAULTSIZE);
    }
    public CircularQueue(int size){
        data = new int[size];
    }
    public boolean add(int elem) throws CustomStackException {
        if(isFull()){
            throw new CustomStackException("Queue is Full");
        }
        data[end] = elem;
        end+=1;
        end = end% data.length;
        size+=1;
        return true;
    }
    public int remove() throws CustomStackException{
        if(isEmpty()){
            throw new CustomStackException("Queue is Empty");
        }
        int removed = data[front];
        front+=1;
        front = front% data.length;
        size-=1;
        return removed;
    }
    public int peek() throws CustomStackException{
        if(isEmpty()){
            throw new CustomStackException("Queue is Empty");
        }
        return data[front];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty!");
            return;
        }
//        int i=front;
//        do{
//            System.out.print(data[i]+" ");
//            i+=1;
//            i = i% data.length;
//        }while(i!=end);
        for(int i=front;i!=end;){
            System.out.print(data[i]+" ");
            i+=1;
            i = i%data.length;
        }
        System.out.println("END");
    }
    public boolean isFull(){
        if(size==data.length){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }
}

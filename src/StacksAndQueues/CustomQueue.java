package StacksAndQueues;

public class CustomQueue {
    private int ptr = 0;
    protected int[] data;
    private static final int DEFAULTSIZE = 5;
    public CustomQueue(){
        this(DEFAULTSIZE);
    }
    public CustomQueue(int size){
        data = new int[size];
    }
    public boolean add(int elem) throws CustomStackException {
        if(iSFull()){
            throw new CustomStackException("Queue is full.");
        }
        data[ptr] = elem;
        ptr+=1;
        return true;
    }
    public int remove() throws CustomStackException{
        if(isEmpty()){
            throw new CustomStackException("Queue is empty!");
        }
        int removed = data[0];
        for(int i=1;i<ptr;i++){
            data[i-1] = data[i];
        }
        ptr-=1;
        return removed;
    }
    public int peek() throws CustomStackException{
        if(isEmpty()){
            throw new CustomStackException("Queue is Empty");
        }
        return data[0];
    }
    public void display() throws CustomStackException {
        if(isEmpty()){
            throw new CustomStackException("Queue is Empty");
        }
        for (int i = 0; i < ptr; i++) {
            System.out.print(data[i]+"<-");
        }
        System.out.println();
    }
    public boolean iSFull(){
        if(ptr==data.length){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if(ptr==0){
            return true;
        }
        return false;
    }
}

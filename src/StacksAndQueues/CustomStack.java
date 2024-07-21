package StacksAndQueues;

public class CustomStack {
    protected int[] data;
    private static final int defaultSize = 5;
    int ptr = -1;
    public CustomStack(){
        this(defaultSize);
    }
    public CustomStack(int length){
        this.data = new int[length];
    }
    public boolean push(int elem) throws CustomStackException {
        if(isFull()){
            throw new CustomStackException("stack is full");
        }
        ptr+=1;
        data[ptr] = elem;
        return true;
    }
    public int pop() throws CustomStackException{
        if(isEmpty()){
            throw new CustomStackException("stack is empty");
        }
        return data[ptr--];
    }
    public int peek() throws CustomStackException{
        if(isEmpty()){
            throw new CustomStackException("stack is empty");
        }
        return data[ptr];
    }
    public boolean isFull() {
        if(ptr == data.length -1){
            return true;
        }
        return  false;
    }
    public boolean isEmpty(){
        if(ptr==-1){
            return true;
        }
        return false;
    }
}

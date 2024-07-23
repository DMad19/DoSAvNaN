package StacksAndQueues;

public class DynamicQueue extends CircularQueue {
    public DynamicQueue(){
        super();
    }
    public DynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean add(int elem) throws CustomStackException {
        if(isFull()){
            int[] temp = new int[data.length*2];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = data[(front+i)%size];
            }
            front = 0;
            end = size;
            data = temp;
        }
        return super.add(elem);
    }
}

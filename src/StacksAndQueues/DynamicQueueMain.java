package StacksAndQueues;

public class DynamicQueueMain{
    public static void main(String[] args) throws CustomStackException{
        DynamicQueue queue = new DynamicQueue(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.display();
        System.out.println(queue.remove());
        queue.display();
        queue.add(22);
        queue.display();
        System.out.println("first element: "+queue.peek());
        queue.remove();
        queue.remove();
        queue.display();
    }
}

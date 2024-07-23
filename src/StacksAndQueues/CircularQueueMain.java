package StacksAndQueues;

public class CircularQueueMain {
    public static void main(String[] args) throws CustomStackException{
        CircularQueue queue = new CircularQueue(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
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

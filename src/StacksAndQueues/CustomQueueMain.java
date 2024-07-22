package StacksAndQueues;

public class CustomQueueMain {
    public static void main(String[] args) throws CustomStackException {
        CustomQueue queue = new CustomQueue(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.display();
        System.out.println(queue.remove());
        queue.display();
        System.out.println("first element: "+queue.peek());
        queue.remove();
        queue.remove();
        queue.display();
    }
}

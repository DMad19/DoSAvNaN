package StacksAndQueues.Questions;

import java.util.Stack;

public class QueueUsingStackRemoveEfficient {
    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println(queue.add(1));
        System.out.println(queue.add(2));
        System.out.println(queue.add(3));
        System.out.println(queue.add(4));
        System.out.println(queue.add(5));
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.add(8));
        System.out.println(queue.peek());
    }
    private static class Queue{
        private Stack<Integer> first = new Stack<>();
        private Stack<Integer> second = new Stack<>();
        public int add(int elem){
            while(!first.empty()){
                second.push(first.pop());
            }
            first.add(elem);
            while(!second.isEmpty()){
                first.push(second.pop());
            }
            return elem;
        }
        public int remove(){
            return first.pop();
        }
        public int peek(){
            return first.peek();
        }
        public boolean isEmpty(){
            return first.isEmpty();
        }
    }
}

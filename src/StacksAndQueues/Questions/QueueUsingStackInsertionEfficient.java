package StacksAndQueues.Questions;

import java.util.Stack;

public class QueueUsingStackInsertionEfficient {
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
            return first.push(elem);
        }
        public int remove(){
            while(!first.isEmpty()){
                second.push(first.pop());
            }
            int removed = second.pop();
            while(!second.isEmpty()){
                first.push(second.pop());
            }
            return removed;
        }
        public int peek(){
            while(!first.isEmpty()){
                second.push(first.pop());
            }
            int peeked = second.peek();
            while(!second.isEmpty()){
                first.push(second.pop());
            }
            return peeked;
        }
        public boolean isEmpty(){
            return first.isEmpty();
        }
    }
}

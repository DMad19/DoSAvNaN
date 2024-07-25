package StacksAndQueues.Questions;

import java.util.Stack;

public class GameOfStacks {
    public static void main(String[] args) {
        Stack<Integer> a = new Stack<>();
        Stack<Integer> b = new Stack<>();
        a.push(1);
        a.push(6);
        a.push(4);
        a.push(2);
        a.push(4);
        b.push(5);
        b.push(8);
        b.push(1);
        b.push(2);
        int target = 10;
        System.out.println(gameOfStacks(a,b,target,0,0));
    }
    public static int gameOfStacks(Stack<Integer> a,Stack<Integer> b,int target,int sum,int count){
        if(sum>target){
            return count;
        }
        int count1 = 0;
        int count2 = 0;
        if(!a.isEmpty()){
            int removed = a.pop();
            count1 = gameOfStacks(a,b,target,sum+removed,count+1);
            a.push(removed);
        }
        if(!b.isEmpty()){
            int removed = b.pop();
            count2 = gameOfStacks(a,b,target,sum+removed,count+1);
            b.push(removed);
        }
        return Math.max(count1,count2);
    }
}

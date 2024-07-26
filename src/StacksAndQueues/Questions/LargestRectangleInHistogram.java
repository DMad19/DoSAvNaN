package StacksAndQueues.Questions;

import java.util.Stack;

public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        System.out.println(getLargestRectangle(heights));
    }
    static int getLargestRectangle(int[] heights){
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int max = 0;
        for (int i = 1;i < heights.length; i++) {
            while (!stack.isEmpty() && heights[i]<heights[stack.peek()]){
                max = Math.max(getmax(stack,heights,i),max);
            }
            stack.push(i);
        }
        int i = heights.length;
        while(!stack.isEmpty()){
            max = Math.max(getmax(stack,heights,i),max);
        }
        return max;
    }
    static int getmax(Stack<Integer> stack,int[] heights,int i) {
        int area;
        int popped = stack.pop();
        if(stack.isEmpty()){
            area = heights[popped] * i;
        }else{
            area = heights[popped] * (i - popped);
        }
        return area;
    }
}

package StacksAndQueues.Questions;

import java.util.Stack;

public class BalanceParanthesisMinInsertions {
    public static void main(String[] args) {
        System.out.println(minInsertions("(()))"));
    }
    static int minInsertions(String a) {
        Stack<Character> s =  new Stack<>();
        int count = 0;
        for(char i:a.toCharArray()){
            if(i=='(' || s.isEmpty()){
                s.push(i);
            }else{
                if(s.peek()==')'){
                    s.pop();
                    while(s.isEmpty() && s.pop()!='('){
                        count+=1;
                    }
                }else{
                    s.push(i);
                }
            }
        }
        return count+s.size();
    }}

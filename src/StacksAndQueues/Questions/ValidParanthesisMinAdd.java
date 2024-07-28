package StacksAndQueues.Questions;

import java.util.Stack;

public class ValidParanthesisMinAdd {
    public static void main(String[] args) {
        System.out.println(validParanthesisMinAdd("(({)){"));
    }
    static int validParanthesisMinAdd(String a){
        Stack<Character> s = new Stack<>();
        int count = 0;
        for(char i:a.toCharArray()){
            if(i=='(' || i=='{' || i=='['){
                s.push(i);
            }
            else{
                if(i==')'){
                    if(s.isEmpty()){
                        count+=1;
                    }else{
                        while(s.pop()!='('){
                            count+=1;
                        }
                    }
                }
                else if(i=='}'){
                    if(s.isEmpty()){
                        count+=1;
                    }else{
                        while(s.pop()!='{'){
                            count+=1;
                        }
                    }
                }
                else{
                    if(s.isEmpty()){
                        count+=1;
                    }else{
                        while(s.pop()!='['){
                            count+=1;
                        }
                    }
                }
            }
        }
        return count+s.size();
    }
}

package StacksAndQueues.Questions;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        System.out.println(isValidParenthesis("(({{}}))["));
    }
    static boolean isValidParenthesis(String a) {
        Stack<Character> s = new Stack<>();
        for (char i : a.toCharArray()) {
            if (i == '(' || i == '[' || i == '{') {
                s.push(i);
            } else {
                if (i == '}') {
                    if (s.isEmpty() || s.pop() != '{') {
                        return false;
                    }
                } else if (i == ']') {
                    if (s.isEmpty() || s.pop() != '[') {
                        return false;
                    }
                } else {
                    if (s.isEmpty() || s.pop() != '(') {
                        return false;
                    }
                }
            }
        }
        return s.isEmpty();
    }
}

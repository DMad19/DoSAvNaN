package Recursion.Questions;

public class firstUpperCase {
    public static void main(String[] args) {
        System.out.println(firstUpperCase("abdshgfasjhfglkjkasgf",0));
    }
    static char firstUpperCase(String s,int i){
        if(i+1==s.length()){
            return '0';
        }
        if(Character.isUpperCase(s.charAt(i))){
            return  s.charAt(i);
        }
        return firstUpperCase(s,i+1);
    }
}

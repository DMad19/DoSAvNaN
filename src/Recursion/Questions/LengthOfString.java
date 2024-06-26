package Recursion.Questions;

public class LengthOfString {
    public static void main(String[] args) {
        System.out.println(lengthOfString("Asdlasd"));
    }
    static int lengthOfString(String s){
        if(s.isEmpty()){
            return 0;
        }
        return 1+lengthOfString(s.substring(1));
    }
}

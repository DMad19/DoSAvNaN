package Recursion.Questions;

public class ReverseString {
    public static void main(String[] args) {
        reverseString("","abcdasd");
        System.out.println(reverseString3("jgkjygk",0));
    }
    static void reverseString(String p,String up){
        if(up==""){
            System.out.println(p);
            return;
        }
        reverseString(up.charAt(0)+p,up.substring(1));
    }
    static String reverseString2(String p,String up){
        if(up==""){
            return p;
        }
        return reverseString2(up.charAt(0)+p,up.substring(1));
    }
    static String reverseString3(String up,int i){
        if(i==up.length()-1){
            return up.charAt(i)+"";
        }
        return reverseString3(up,i+1)+up.charAt(i);
    }
}

package Recursion.Questions;

public class RemoveConsecutiveCharacters {
    public static void main(String[] args) {
        System.out.println(removeConsecutive("","aaaaaaaa"));
    }
    static String removeConsecutive(String p, String up){
        if(up.isEmpty()){
            return p;
        }
        if(!p.isEmpty() && p.charAt(p.length()-1)==up.charAt(0)){
            return removeConsecutive(p,up.substring(1));
        }
        return removeConsecutive(p+up.charAt(0),up.substring(1));
    }
}

package Recursion.Questions;

import java.util.ArrayList;

public class PossiblePalindromicPartitions {
    public static void main(String[] args) {
        System.out.println(fun(new ArrayList<>(),"xrxx"));
    }
    static ArrayList<ArrayList<String>> fun(ArrayList<String> a, String s){
        if(s.isEmpty()){
            boolean flag = true;
            ArrayList<ArrayList<String>> arr = new ArrayList<>();
            arr.add((ArrayList<String>)a.clone());
            return arr;
        }
        ArrayList<ArrayList<String>> arr = new ArrayList<>();
        for(int i=1;i<=s.length();i++){
            String p = s.substring(0,i);
            if(!isPalindromic(p)){
                continue;
            }
            a.add(p);
            arr.addAll(fun(a,s.substring(i)));
            a.remove(a.size()-1);
        }
        return arr;
    }
    static boolean isPalindromic(String p){
        for(int i=0;i<p.length()/2;i++){
            if(p.charAt(i)!=p.charAt(p.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}

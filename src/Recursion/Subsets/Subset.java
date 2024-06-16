package Recursion.Subsets;

import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        subsets("","abc",l);
        System.out.println(l);
        ArrayList<String> l2 = subseq("","abc");
        System.out.println(l2);
    }
    static void subsets(String p, String up, ArrayList<String> l){
        if(up.isEmpty()){
            l.add(p);
            return;
        }
        subsets(p+up.charAt(0),up.substring(1),l);
        subsets(p,up.substring(1),l);
    }
    static ArrayList<String> subseq(String p, String up){
        ArrayList<String> l = new ArrayList<>();
        if(up.isEmpty()){
            l.add(p);
            return l;
        }
        ArrayList<String> left =  subseq(p+up.charAt(0), up.substring(1));
        ArrayList<String> right = subseq(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}

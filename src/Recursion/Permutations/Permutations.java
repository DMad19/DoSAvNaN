package Recursion.Permutations;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        ArrayList l = Permutations("","abc");
        System.out.println(l);
        ArrayList l2 = new ArrayList();
        Permutations2("","abc",l2);
        System.out.println(l2);
        int count = CountPermutations("","abc");
        System.out.println(count);
        int count2 = CountPermutations2("","abc",0);
        System.out.println(count2);
    }
    static ArrayList Permutations(String p,String up){
        ArrayList l = new ArrayList();
        if(up.isEmpty()){
            l.add(p);
            return l;
        }
        for(int i=0;i<p.length()+1;i++){
            ArrayList nl = Permutations(p.substring(0,i)+up.charAt(0)+p.substring(i),up.substring(1));
            l.addAll(nl);
        }
        return l;
    }
    static void Permutations2(String p,String up,ArrayList l){
        if(up.isEmpty()){
            l.add(p);
            return;
        }
        for(int i=0;i<p.length()+1;i++){
            Permutations2(p.substring(0,i)+up.charAt(0)+p.substring(i),up.substring(1),l);
        }
    }
    static int CountPermutations(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        for(int i=0;i<p.length()+1;i++){
            count += CountPermutations(p.substring(0,i)+up.charAt(0)+p.substring(i),up.substring(1));
        }
        return count;
    }
    static int CountPermutations2(String p,String up,int count){
        if(up.isEmpty()){
            return count+1;
        }
        for(int i=0;i<p.length()+1;i++){
            count = CountPermutations2(p.substring(0,i)+up.charAt(0)+p.substring(i),up.substring(1),count);
        }
        return count;
    }
}

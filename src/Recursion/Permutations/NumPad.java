package Recursion.Permutations;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NumPad {
    public static void main(String[] args) {
        pad("","12");
        System.out.println();
        System.out.println(pad2("","12"));
        System.out.println(countPad("","12"));
    }
    static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        int dig = up.charAt(0) - '0';
        for (int i = (dig-1)*3; i < dig*3 ; i++) {
            char ch = (char) ('a'+i);
            pad(p+ch,up.substring(1));
        }
    }
    static ArrayList pad2(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }
        ArrayList<String> l = new ArrayList<>();
        int dig = up.charAt(0) - '0';
        for (int i = (dig-1)*3; i < dig*3 ; i++) {
            char ch = (char) ('a'+i);
            l.addAll(pad2(p+ch,up.substring(1)));
        }
        return l;
    }
    static int countPad(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        int dig = up.charAt(0) - '0';
        for (int i = (dig-1)*3; i < dig*3 ; i++) {
            char ch = (char) ('a'+i);
            count += (countPad(p+ch,up.substring(1)));
        }
        return count;
    }
}

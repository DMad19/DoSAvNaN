package Recursion.Questions;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GrayCode {
    public static void main(String[] args) {
        System.out.println(graycode(3));
    }
    static ArrayList<String> graycode(int n){
        if(n==1){
            ArrayList<String> l = new ArrayList<String>();
            l.add("0");
            l.add("1");
            return l;
        }
        ArrayList<String> l = graycode(n-1);
        ArrayList<String> ans = new ArrayList<>();
        ans.addAll(l);
        for(int i=l.size()-1;i>-1;i--){
            ans.add(l.get(i));
        }
        for(int i=0;i<l.size();i++){
            ans.set(i,"0"+ans.get(i));
        }
        for(int i=l.size();i< ans.size();i++){
            ans.set(i,"1"+ans.get(i));
        }
        return ans;
    }
}

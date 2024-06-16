package SubSequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList nl = getSubsets(arr);
//        for(Object i:nl){
//            System.out.println(i);
//        }
        int[] narr = {1,2,3,2};
        ArrayList l = getSubsetswithDupes(narr);
        for(Object i:l){
            System.out.println(i);
        }
    }
    static ArrayList<ArrayList<Integer>> getSubsets(int[] l){
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int i:l){
            int n= outer.size();
            for (int j = 0; j < n; j++) {
                ArrayList<Integer> nl = new ArrayList<Integer>(outer.get(j));
                nl.add(i);
                outer.add(nl);
            }
        }
        return outer;
    }
    static ArrayList<ArrayList<Integer>> getSubsetswithDupes(int[] l){
        Arrays.sort(l);
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 1;
        for (int i = 0; i < l.length; i++) {
            start = 0;
            if(i>0 && l[i]==l[i-1]){
                start = end ;
            }
            int n= outer.size();
            for (int j = start; j < n; j++) {
                ArrayList<Integer> nl = new ArrayList<Integer>(outer.get(j));
                nl.add(l[i]);
                outer.add(nl);
            }
            end = outer.size()-1;
        }
        return outer;
    }
}

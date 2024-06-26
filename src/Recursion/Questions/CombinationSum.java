package Recursion.Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        Arrays.sort(arr);
        ArrayList<Integer> l = new ArrayList<>();
        for(int i:arr){
            l.add(i);
        }
        System.out.println(findCombinationSum(new ArrayList<Integer>(),l,7 ));
    }
    static ArrayList<ArrayList<Integer>> findCombinationSum(ArrayList<Integer> p, ArrayList<Integer> up, int target){
        if(findsum(p)==target){
            ArrayList<ArrayList<Integer>> l = new ArrayList<>();
            l.add((ArrayList<Integer>) p.clone());
            return l;
        }
        if(up.size()==0){
            ArrayList<ArrayList<Integer>> l = new ArrayList<>();
            return l;
        }
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        p.add(up.get(0));
        if(findsum(p)>target){
            p.remove(p.size()-1);
            return l;
        }
        l.addAll(findCombinationSum(p, up, target));
        p.remove(p.size()-1);
        int a = up.get(0);
        up.remove(0);
        l.addAll(findCombinationSum(p,up,target));
        up.add(0,a);
        return l;
    }
    static int findsum(ArrayList<Integer> arr){
        int sum = 0;
        for(int i:arr){
            sum+= i;
        }
        return sum;
    }
}

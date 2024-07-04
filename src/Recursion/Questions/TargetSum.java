package Recursion.Questions;


import java.util.ArrayList;

public class TargetSum {
    public static void main(String[] args) {
        int[] a = {1,1,1,1,1};
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            l.add(a[i]);
        }
        System.out.println(getTargetSum(l,5,0));
    }
    static int getTargetSum(ArrayList<Integer> l,int target,int i){
        int c = 0;
        if(i<l.size()){
            l.set(i, -l.get(i));
            if(getsum(l)==target){
                c+=1;
            }
            c+=getTargetSum(l,target,i+1);
            l.set(i,-l.get(i));
            if(i==0){
                if(getsum(l)==target){
                    c+=1;
                }
            }
            c+=getTargetSum(l,target,i+1);
        }
        return c;
    }
    static int getsum(ArrayList<Integer> a){
        int sum = 0;
        for(int i:a){
            sum += i;
        }
        return sum;
    }
}

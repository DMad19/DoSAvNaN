package Recursion.Array;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,4,2,5,1,3};
        int target = 3;
        int n = 0;
        System.out.println(linearSearch(arr,target,n));
        System.out.println(linearSearch2(arr,target,n));
        System.out.println(linearSearchFromBack(arr,target,arr.length-1));
        System.out.println(linearSearchFromBackAndFroth(arr,target,arr.length-1,new ArrayList<>()));
        linearSearchFromBackAndFroth2(arr,target,arr.length-1);
        System.out.println(al);
        System.out.println(linearSearchFromBackAndFroth3(arr,target,arr.length-1));
    }
    static boolean linearSearch(int[] arr,int target,int n){
        if(n==arr.length){
            return false;
        }
        if(arr[n]==target){
            return true;
        }
        return linearSearch(arr,target,n+1);
    }
    static int linearSearch2(int[] arr,int target,int n){
        if(n==arr.length){
            return -1;
        }
        if(arr[n]==target){
            return n;
        }
        return linearSearch2(arr,target,n+1);
    }
    static int linearSearchFromBack(int[] arr,int target,int n){
        if(n==-1){
            return -1;
        }
        if(arr[n]==target){
            return n;
        }
        return linearSearchFromBack(arr,target,n-1);
    }
    static ArrayList<Integer> linearSearchFromBackAndFroth(int[] arr, int target, int n, ArrayList<Integer> list){
        if(n==-1){
            return list;
        }
        if(arr[n]==target){
            list.add(n);
        }
        return linearSearchFromBackAndFroth(arr,target,n-1,list);
    }
    static ArrayList al = new ArrayList();
    static void linearSearchFromBackAndFroth2(int[] arr, int target, int n){
        if(n==-1){
            return ;
        }
        if(arr[n]==target){
            al.add(n);
        }
        linearSearchFromBackAndFroth2(arr,target,n-1);
    }
    static ArrayList linearSearchFromBackAndFroth3(int[] arr, int target, int n){
        ArrayList l = new ArrayList();
        if(n==-1){
            return l;
        }
        if(arr[n]==target){
            l.add(n);
        }
        ArrayList l2 = linearSearchFromBackAndFroth3(arr,target,n-1);
        l.addAll(l2);
        return l;
    }
}

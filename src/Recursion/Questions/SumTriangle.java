package Recursion.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SumTriangle {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printSumTriangle(arr);
        ArrayList list = new ArrayList();
        for (int i = 1 ; i <= 5; i++) {
            list.add(i);
        }
        System.out.println(returnSumTriangle(list));
    }
    static void printSumTriangle(int[] arr){
        if(arr.length == 1){
            System.out.println(Arrays.toString(arr));
            return;
        }
        int[] newarr = new int[arr.length-1];
        for (int i = 0; i < arr.length-1; i++) {
            newarr[i] = arr[i]+arr[i+1];
        }
        printSumTriangle(newarr);
        System.out.println(Arrays.toString(arr));
    }
    static ArrayList<ArrayList<Integer>> returnSumTriangle(ArrayList<Integer> arr){
        if(arr.size() == 1){
            ArrayList<ArrayList<Integer>> a = new ArrayList();
            a.add(arr);
            return  a;
        }
        ArrayList<Integer> newarr = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < arr.size()-1; i++) {
            int elem = arr.get(i) + arr.get(i+1);
            newarr.add(elem);
        }
        ans.addAll(returnSumTriangle(newarr));
        ans.add(arr);
        return ans;
    }
}

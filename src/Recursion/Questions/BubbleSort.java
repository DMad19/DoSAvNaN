package Recursion.Questions;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        bsort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void bsort(int[] arr,int n){
        if(n==1){
            return;
        }
        boolean flag = false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                flag = true;
            }
        }
        if(!flag){
            return;
        }
        bsort(arr,n-1);
    }
}

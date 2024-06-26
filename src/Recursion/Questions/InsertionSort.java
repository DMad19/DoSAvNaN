package Recursion.Questions;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        insertionSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr,int n){
        if(n==1){
            return;
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        int temp = arr[max];
        arr[max] = arr[n-1];
        arr[n-1] = temp;
        insertionSort(arr,n-1);
    }
}

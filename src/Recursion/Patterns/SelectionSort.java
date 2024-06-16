package Recursion.Patterns;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};
        selectionSort(arr,5,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr, int r, int c,int max){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[max]){
                max = c;
            }
            selectionSort(arr,r,c+1,max);
        }else {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selectionSort(arr, r - 1, 0, 0);
        }
    }
}

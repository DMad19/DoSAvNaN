package Recursion.Patterns;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,1,1};
        bubblesort2(arr,5,0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr,int i,int j){
        if(i==arr.length-1){
            return;
        }
        if(j<arr.length-i-1){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
            bubbleSort(arr,i,j+1);
        }
        bubbleSort(arr,i+1,0);
    }
    static void bubblesort2(int[] arr, int r, int c){
        if(r==0){
            return;
        }
        if(c<r-1){
            if(arr[c]>arr[c+1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubblesort2(arr,r,c+1);
        }
        bubblesort2(arr,r-1,0);
    }
}

package Sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,5,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int max  = 0;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]>arr[max]){
                    max = j;
                }
            }
            swap(arr,max,arr.length-i-1);
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

package Recursion.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1,5,1};
        int[] sorted = mergeSort(arr);
        System.out.println(Arrays.toString(sorted));
    }
    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = (0+arr.length-1)/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid+1));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid+1,arr.length));
        return merge(left,right);
    }
    static int[] merge(int[] left,int[] right){
        int[] mix = new int[left.length+right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                mix[k] = left[i];
                i+=1;
            }
            else{
                mix[k] = right[j];
                j+=1;
            }
            k+=1;
        }
        while(i<left.length){
            mix[k] = left[i];
            i+=1;
            k+=1;
        }
        while(j<right.length){
            mix[k] = right[j];
            j+=1;
            k+=1;
        }
        return mix;
    }
}

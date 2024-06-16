package Recursion.Sorting;

import java.util.Arrays;

public class MergeInPlace {
    public static void main(String[] args) {
        int[] arr = {3,2,1,4,5};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int[] arr,int s,int e){
        if(s==e){
            return;
        }
        int mid = (s+e)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1,e);
        merge(arr,s,mid,e);
    }
    static void merge(int[] arr,int s,int mid,int e){
        int[] mix = new int[e-s+1];
        int i = s;
        int j = mid+1;
        int k = 0;
        while(i<mid+1 && j<e+1){
            if(arr[i]<arr[j]){
                mix[k] = arr[i];
                i+=1;
            }
            else{
                mix[k] = arr[j];
                j+=1;
            }
            k+=1;
        }
        while(i<mid+1){
            mix[k] = arr[i];
            i+=1;
            k+=1;
        }
        while(j<e+1){
            mix[k] = arr[j];
            j+=1;
            k+=1;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}

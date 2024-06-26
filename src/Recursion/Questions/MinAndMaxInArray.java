package Recursion.Questions;

import java.util.Arrays;

public class MinAndMaxInArray {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 4, 3, -5, -4, 8, 6};
        getMinAndMax(arr,0,arr[0],arr[0]);
        System.out.println(Arrays.toString(returnMinAndMax(arr,0,arr[0],arr[0])));
        System.out.println(Arrays.toString(returnMinAndMax2(arr)));
    }
    static void getMinAndMax(int[] arr,int i,int min,int max){
        if(i==arr.length-1){
            System.out.println(min+" " +max);
            return;
        }
        if(arr[i]<min){
            min = arr[i];
        }
        if(arr[i]>max){
            max = arr[i];
        }
        getMinAndMax(arr,i+1,min,max);
    }
    static int[] returnMinAndMax(int[] arr,int i,int min,int max){
        if(i==arr.length-1){
            return new int[] {min,max};
        }
        if(arr[i]<min){
            min = arr[i];
        }
        if(arr[i]>max){
            max = arr[i];
        }
        return returnMinAndMax(arr,i+1,min,max);
    }
    static int returnMin(int[] arr, int i){
        if(i==arr.length-1){
            return arr[i];
        }
        int min = Math.min(arr[i],returnMin(arr,i+1));
        return min;
    }
    static int returnMax(int[] arr, int i){
        if(i==arr.length-1){
            return arr[i];
        }
        int max = Math.max(arr[i],returnMax(arr,i+1));
        return max;
    }
    static int[] returnMinAndMax2(int[] arr){
        return new int[] {returnMin(arr,0),returnMax(arr,0)};
    }
}

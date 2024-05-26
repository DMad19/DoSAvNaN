package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReversingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            swap(arr,i, arr.length-i-1);
        }
    }
    static void swap(int[] arr,int index,int target){
        int temp = arr[index];
        arr[index] = arr[target];
        arr[target] = temp;
    }
}

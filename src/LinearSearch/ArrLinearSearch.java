package LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class ArrLinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(search(arr,3));
        System.out.println(search2(arr,33));
    }
    static int search(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target) {
                return i;
            }
        }
        return -1;
    }
    static boolean search2(int[] arr, int target){
        for(int i:arr){
            if(i==target){
                return true;
            }
        }
        return false;
    }
}

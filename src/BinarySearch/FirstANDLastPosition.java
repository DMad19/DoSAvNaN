package BinarySearch;

import java.util.Arrays;

public class FirstANDLastPosition {
    //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
    public static void main(String[] args) {
        int[] arr = new int[2];
        int[] numbers = {5,7,7,8,8,10};
        int target = 7;
//        arr[0] = getFloorOfANumber(numbers,target);
//        arr[1] = findCeiling(numbers,target);
        arr[0] = firstANDlast(numbers,target,true);
        arr[1] = firstANDlast(numbers,target,false);
        System.out.println(Arrays.toString(arr));
    }
    static int findCeiling(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        boolean flag = false;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                flag = true;
            }
            if(arr[mid]>target){
                end = mid -1;
            }
            else{
                start = mid+1;
            }
        }
        if(flag)
            return start-1;
        else
            return -1;
    }
    static int getFloorOfANumber(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        boolean flag = false;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                flag = true;
            }
            if(arr[mid]>=target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        if(flag)
            return end+1;
        else
            return -1;
    }

    static int firstANDlast(int[] arr,int target,boolean findFirstIndex){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                ans = mid;
                if(findFirstIndex){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else if(arr[mid]>target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
}

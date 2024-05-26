package BinarySearch;

import java.util.Arrays;

public class ElementInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,7,11,15,16,18,19,20,22,45,67,99};
        int target = 100;
        int[] range = findRange(arr,target);
        System.out.println(Arrays.toString(range));

        System.out.println(binarySearch(arr,target,range[0],range[1]));
    }
    static int[] findRange(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(true){
            if(arr[end]>=target){
                break;
            }
            else{
                int temp = end;
                end = end + (end-start+1)*2;
                start = temp + 1;
            }
        }
        return new int[] {start,end};
    }
    static int binarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target>arr[mid]){
                start = mid +1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}

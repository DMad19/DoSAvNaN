package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3,6,7,8,10,13,15};
        System.out.println(BS(arr,88,0,arr.length-1));
    }
    static int BS(int[] arr, int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]<target){
            return BS(arr,target,mid+1,end);
        }
        return  BS(arr,target,start,mid-1);
    }
}

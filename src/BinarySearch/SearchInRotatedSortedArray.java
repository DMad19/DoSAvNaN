package BinarySearch;

public class SearchInRotatedSortedArray {
//    https://leetcode.com/problems/search-in-rotated-sorted-array/
    public static void main(String[] args) {
        int[] arr = {3,5,1};
        int target = 3;
        System.out.println(getIndex(arr,target));
    }
    static int getIndex(int[] arr,int target){
        int pivot = findPivot(arr);
        if(pivot==-1){
            return ascBinarySearch(arr,target,0,arr.length-1);
        }
        if(arr[pivot]==target){
            return pivot;
        }
        else if(target>=arr[0]){
            return ascBinarySearch(arr,target,0,pivot-1);
        }
        return ascBinarySearch(arr,target,pivot+1,arr.length-1);
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start) /2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]>=arr[mid]){
                end = mid -1;
            }
            else{
                start = mid+1;
                // we can skip start = mid because
                // if mid is pivot then it would have been caught in first and second conditionals
            }
        }
        return -1;
    }
    static int ascBinarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]>target){
                end = mid -1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}

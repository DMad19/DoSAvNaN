package BinarySearch;

public class FindingInMountainArray {
//    https://leetcode.com/problems/find-in-mountain-array/description/
    public static void main(String[] args) {
        int[] arr = {1,3,5,4,2,0};
        int target = 2;
        System.out.println(findInMountainArray(arr,target));
    }
    static int findInMountainArray(int[] arr,int target){
        int peakIndex = getPeakIndex(arr);
        int ans = binarySearch(arr,target,0,peakIndex);
        if(ans!=-1){
            return ans;
        }
        return  binarySearch(arr,target,peakIndex+1,arr.length-1);
    }
    static int getPeakIndex(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end - start)/2;
            if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
    static int binarySearch(int[] arr, int target,int start,int end){
        boolean isAsc;
        if(arr[start]<arr[end]){
            isAsc = true;
        }
        else{
            isAsc = false;
        }
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid]==target){
                return  mid;
            }
            else if(arr[mid]>target){
                if(isAsc){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(isAsc){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}

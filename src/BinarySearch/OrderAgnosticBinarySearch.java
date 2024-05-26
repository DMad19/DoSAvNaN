package BinarySearch;

public class OrderAgnosticBinarySearch {
    //https://youtu.be/f6UU7V3szVw?si=byQXZtekfg-iHEaD
    public static void main(String[] args) {
        int[] arr = {};
        int target = 6;
        System.out.println(orderAgnosticBS(arr,target));
    }
    static int orderAgnosticBS(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end];
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(arr[mid]>target){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(arr[mid]>target){
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

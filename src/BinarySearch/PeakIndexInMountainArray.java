package BinarySearch;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,4,3,2,1};
        System.out.println(getPeakIndex(arr));
        System.out.println(getPeakIndexByKunal(arr));
    }
    static int getPeakIndex(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return mid;
            }
            else if(arr[mid]>arr[mid-1]){
                start = mid;
            }
            else{
                end = mid;
            }
        }
        return -1;
    }
    static int getPeakIndexByKunal(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid+1]>arr[mid]){
//                start = mid;  debug to figure it out why it's wrong
                start = mid +1;
            }
            else{
//                end = mid-1; this too
                end = mid;
            }
        }
        return start;
    }

}

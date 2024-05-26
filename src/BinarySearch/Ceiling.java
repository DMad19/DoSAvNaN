package BinarySearch;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,11,19,20};
        System.out.println(findCeiling(arr,21));
    }
    static int findCeiling(int[] arr,int target){
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            else if(arr[mid]>target){
                end = mid -1;
            }
            else{
                start = mid+1;
            }
        }
        return arr[start];
    }
}

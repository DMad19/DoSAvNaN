package BinarySearch;

public class CountNoOfRotations {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(getRotations(arr));
    }
    static int getRotations(int[] arr){
        return findPivot(arr)+1;
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
}

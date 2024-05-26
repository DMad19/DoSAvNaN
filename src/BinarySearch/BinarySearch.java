package BinarySearch;

public class BinarySearch {
    //    https://youtu.be/f6UU7V3szVw?si=n2x1QAftuk_pzG02
    public static void main(String[] args) {
        int[] arr = {-4,-6,5,6,7,8,9,11,100};
        int target = 56;
        int[] arr2 = {99,90,78,8,7,6,0,-1,-99};
        int target2 = 90;
        System.out.println(ascBinarySearch(arr,target));
        System.out.println(descBinarySearch(arr2,target2));
    }
    static int ascBinarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
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
    static int descBinarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]>target){
                start = mid +1;
            }
            else{
                end= mid-1;
            }
        }
        return -1;
    }
}

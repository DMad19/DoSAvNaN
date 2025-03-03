package BinarySearch;

public class SearchINRotatedArrayWithDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,2,2,3};
        int target = 2;
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
            int mid = start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid>start && arr[mid]<arr[mid-1]){ //not sure why arr[mid] < arr[mid+1] and return mid+1
                return mid-1;
            }
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]<arr[end])){
                start = mid+1;
            }
            else{
                end = mid-1;
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

package BinarySearch;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(arr,k));
    }
    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for(int i:nums){
            end += i;
            if(i>start){
                start = i;
            }
        }
        while(start<end){
            int mid = start+(end-start)/2;
            int c = 1;
            int sum = 0;
            for(int i:nums){
                sum += i;
                if(sum>mid){
                    sum = i;
                    c+=1;
                }
            }
            if(c>k){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
}

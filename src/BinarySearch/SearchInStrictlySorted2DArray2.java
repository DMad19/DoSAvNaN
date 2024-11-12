package BinarySearch;

import java.util.Arrays;

public class SearchInStrictlySorted2DArray2 {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int target = -1;
        int row = search(nums,target);
        int[] ans = bs(nums,target,row);
        System.out.println(Arrays.toString(ans));
    }
    static int search(int[][] nums,int target){
        int low = 0;
        int high = nums.length-1;
        while(low<high){
            int mid = low + (high - low)/2;
            if(nums[mid][nums.length-1]==target){
                return mid;
            }else if(nums[mid][nums.length-1]>target){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
    static int[] bs(int[][] nums,int target,int row){
        int low = 0;
        int high = nums[row].length-1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(nums[row][mid]<target){
                low = mid +1;
            }else{
                high = mid - 1;
            }
        }
        if(low>nums.length-1 || nums[row][low]!=target){
            return new int[] {-1,-1};
        }
        return new int[] {row,low};
    }
}

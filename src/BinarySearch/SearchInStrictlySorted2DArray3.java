package BinarySearch;

import java.util.Arrays;

public class SearchInStrictlySorted2DArray3 {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int target = 12;
        System.out.println(Arrays.toString(bs(nums,target)));
    }
    static int[] bs(int[][] nums,int target){
        int rows = nums.length;
        int cols = nums[0].length;
        int low = 0;
        int high = rows*cols -1;
        while(low<=high){
            int mid = low + (high - low)/2;
            int row = mid/cols;
            int col = mid%cols;
            if(nums[row][col] == target){
                return new int[] {row,col};
            }else if(nums[row][col]<target){
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        return new int[] {-1,-1};
    }
}

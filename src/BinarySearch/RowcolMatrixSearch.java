package BinarySearch;

import java.util.Arrays;

public class RowcolMatrixSearch {
    public static void main(String[] args) {
        int[][] arr = {
                {1,20},
                {3,40},
                {5,70}
        };
        int target = 3;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[][] arr,int target){
        int row = 0;
        int col = arr[0].length-1;
        while(row<arr.length && col>-1){
            if(arr[row][col] == target){
                return new int[] {row,col};
            }
            else if(arr[row][col]>target){
                col -= 1;
            }
            else{
                row+=1;
            }
        }
        return new int[] {-1,-1};
    }
}

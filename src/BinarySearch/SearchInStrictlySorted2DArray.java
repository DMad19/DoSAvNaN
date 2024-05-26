package BinarySearch;

import java.util.Arrays;

public class SearchInStrictlySorted2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 9;
        System.out.println(Arrays.toString(searchInStrictlySortedArray(arr,target)));
    }
    static int[] binarySearch(int[][] arr,int target,int row,int colStart,int colEnd){
        while(colStart<=colEnd){
            int mid = colStart+(colEnd-colStart)/2;
            if(arr[row][mid]==target){
                return new int[] {row,mid};
            }
            else if(arr[row][mid]>target){
                colEnd = mid -1;
            }
            else{
                colStart = mid +1;
            }
        }
        return new int[] {-1,-1};
    }
    static int[] searchInStrictlySortedArray(int[][] arr,int target){
        int rowStart = 0;
        int rowEnd = arr.length-1;
        int colMid = (arr[0].length-1)/2;
        if(rowEnd == -1){
            return new int[] {-1,-1};
        }
        else if(rowEnd == 0){
            return binarySearch(arr,target,rowEnd,0,arr[rowEnd].length -1);
        }
        while(rowStart<rowEnd-1){
            int mid = rowStart + (rowEnd-rowStart)/2;
            if(arr[mid][colMid]==target){
                return new int[] {mid,colMid};
            }
            else if(arr[mid][colMid]>target){
                rowEnd = mid;
            }
            else{
                rowStart = mid;
            }
        }
        if(arr[rowStart][colMid] == target){
            return new int[] {rowStart,colMid};
        } else if (arr[rowEnd][colMid] == target) {
            return new int[] {rowEnd,colMid};
        }
        if(target<=arr[rowStart][colMid-1]){
            return binarySearch(arr,target,rowStart,0,colMid-1);
        }
        else if(target>=arr[rowStart][colMid-1] && target<=arr[rowStart][arr[rowStart].length -1]){
            return binarySearch(arr,target,rowStart,colMid+1,arr[rowStart].length -1);
        }
        if(target<=arr[rowEnd][colMid-1]){
            return binarySearch(arr,target,rowEnd,0,colMid-1);
        }
        else {
            return binarySearch(arr,target,rowEnd,colMid+1,arr[rowEnd].length -1);
        }
    }
}

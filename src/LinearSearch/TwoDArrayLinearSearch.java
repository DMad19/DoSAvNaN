package LinearSearch;

import java.util.Arrays;

public class TwoDArrayLinearSearch {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 4},
                {5, 6, 8},
                {9, 0, 3}
        };
        System.out.println(Arrays.toString(search(arr, 1)));
        System.out.println(search2(arr,2));
        System.out.println(maximum(arr));
    }
    static int[] search(int[][] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    static boolean search2(int[][] arr,int target){
        for (int[] i:arr) {
            for(int j:i){
                if(j==target){
                    return true;
                }
            }
        }
        return false;
    }

    static int maximum(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] i:arr){
            for(int j:i){
                if(j>max){
                    max = j;
                }
            }
        }
        return max;
    }
}

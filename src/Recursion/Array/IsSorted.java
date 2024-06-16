package Recursion.Array;

public class IsSorted {
    public static void main(String[] args) {
        System.out.println(isSorted(new int[] {1,2,3,4}));
    }
    static boolean isSorted(int[] arr){
        return helper(arr,0);
    }
    static boolean helper(int[] arr,int n){
        if(n==arr.length-1){
            return true;
        }
        return arr[n]<arr[n+1] && helper(arr,n+1);
    }
}

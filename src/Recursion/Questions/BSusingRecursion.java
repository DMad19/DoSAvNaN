package Recursion.Questions;

public class BSusingRecursion {
    public static void main(String[] args) {
        int[] arr = {4,5,10,22,45,66};
        System.out.println(bs(arr,98,0,arr.length-1));
    }
    static int bs(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
            return bs(arr,target,start,mid-1);
        }
        return bs(arr,target,mid+1,end);
    }
}

package Recursion.Patterns;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] l = {4,3,2,1,5};
        quickSort(l,0,l.length-1);
        System.out.println(Arrays.toString(l));
    }
    static void quickSort(int[] nums,int l,int h){
        if(l>=h){
            return;
        }
        int s = l;
        int e = h;
        int mid = s+(e-s)/2;
        int p = nums[mid];
        while(s<=e){
            while(nums[s]<p){
                s+=1;
            }
            while(nums[e]>p){
                e-=1;
            }
            if(s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s+=1;
                e-=1;
            }
        }
        quickSort(nums,l,e);
        quickSort(nums,s,h);
    }
}

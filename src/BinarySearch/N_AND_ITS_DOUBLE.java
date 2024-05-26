package BinarySearch;

import java.util.Arrays;

public class N_AND_ITS_DOUBLE {
    //https://leetcode.com/problems/check-if-n-and-its-double-exist/
    public static void main(String[] args) {
        int[] arr = {2,5,10};
        System.out.println(checkForNandItsDouble(arr));
    }
    static boolean checkForNandItsDouble(int[] nums){
        Arrays.sort(nums);
        reverse(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            if (nums[i] > 0) {
                if (dscBinary(nums, start, end, i)) {
                    return true;
                }
            } else {
                if (ascBinary(nums, start, end, i)) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean dscBinary(int[] nums, int start, int end, int i) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[i] == nums[mid] * 2) {
                return true;
            } else if (nums[i] > nums[mid] * 2) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
    static boolean ascBinary(int[] nums, int start, int end, int i) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[i] * 2 == nums[mid]) {
                return true;
            } else if (nums[i] * 2 > nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
    static int[] reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}

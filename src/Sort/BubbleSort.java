package Sort;

import java.util.Arrays;
//strictly sorted
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,5,1,1,8};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            boolean flag = false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
    }
}

package LinearSearch;

public class MinimumElement {
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,5};
        System.out.println(getMin(arr));
    }
    static int getMin(int[] arr){
        if(arr.length==0){
            return -9999;
        }
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
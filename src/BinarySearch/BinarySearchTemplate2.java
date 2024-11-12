package BinarySearch;

public class BinarySearchTemplate2 {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5};
        int target = 2;
        System.out.println(bs(weights,target));
    }
    static int bs(int[] weights,int target){
        int low = 0;
        int high = weights.length-1;
        int ans = -1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(condition(weights,mid,target)){
                ans = mid;
                low = mid+1;
            }else{
                high = mid -1;
            }
        }
        return ans;
    }
    static boolean condition(int [] weights,int mid, int target){
        if(weights[mid]<=target){
            return true;
        }
        return false;
    }
}

package BinarySearch;

public class BinarySearchTemplate {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5};
        int target = 0;
        System.out.println(bs(weights,target));
    }
    static int bs(int[] weights,int target){
        if(target<weights[0] || target>weights[0]){
            return -1;
        }
        int low = 0;
        int high = weights.length-1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(condition(weights,mid,target)){
                low = mid+1;
            }else{
                high = mid -1;
            }
        }
        return low;
    }
    static boolean condition(int [] weights,int mid, int target){
        if(weights[mid]<target){
            return true;
        }
        return false;
    }
}

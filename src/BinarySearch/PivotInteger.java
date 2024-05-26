package BinarySearch;

public class PivotInteger {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(getPivotInteger(n));
    }
    static int getPivotInteger(int n) {
        int start = 1;
        int end = n;
        int total = n*(n+1)/2;
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            int x = (mid*(mid+1))/2;
            if(x==(total-x+mid)){
                ans = mid;
                break;
            }
            else if(x<total-x+mid){
                start = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        return ans;
    }
}

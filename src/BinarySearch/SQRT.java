package BinarySearch;

public class SQRT {
    public static void main(String[] args) {
        int num = 7;
        System.out.println(mySqrt(num));
    }
    static int mySqrt(int x) {
        if(x==1){
            return 1;
        }
        int start = 1;
        int end = x/2;
        while(start<=end){
            int mid = start+(end-start)/2;
            if((long)mid*mid>(long)x){
                end=mid-1;
            }
            else if((long)mid*mid==(long)x){
                return mid;
            }
            else{
                start = mid+1;
            }
        }
        return end;
    }
}

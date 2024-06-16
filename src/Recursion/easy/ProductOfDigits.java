package Recursion.easy;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(POD(1053));
    }
    static int POD(int n){
        if(n<=1){
            return 1;
        }
        return POD(n/10)*(n%10);
    }
}

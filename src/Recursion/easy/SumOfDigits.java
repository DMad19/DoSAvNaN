package Recursion.easy;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(SOD(8769));
    }
    static int SOD(int n){
        if(n==0){
            return 0;
        }
        return SOD(n/10)+(n%10);
    }
}

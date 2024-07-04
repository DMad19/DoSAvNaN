package Recursion.Questions;

public class XPowOfN {
    public static void main(String[] args) {
        double x = 1.00000;
        int n = -2147483648;
        System.out.println( getpow(x,n));
    }
    static double getpow(double x,int n){
        long N = n;
        if(N==0){
            return 1;
        }
        if (N < 0) {
            N = -N;
            x = 1 / x;
        }
        if(N%2==0){
            return getpow(x*x,(int)(N/2));
        }
        return x*getpow(x,(int)(N-1));
    }
}

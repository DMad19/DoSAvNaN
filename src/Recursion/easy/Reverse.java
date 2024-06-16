package Recursion.easy;

public class Reverse {
    public static void main(String[] args) {
        way1(1234);
        System.out.println(way2(8765));
        System.out.println(palindrome(3234));
    }
    static int sum = 0;
    static void way1(int n){
        if(n<10){
            sum = sum*10 +n;
            System.out.println(sum);
            return;
        }
        int rem = n%10;
        sum = sum*10 +rem;
        way1(n/10);
    }
    static int way2(int n){
        int digits = (int)(Math.log(n)/Math.log(10))+1;
        return helper(n,digits);
    }
    static int helper(int n,int digits){
        if(n<=9){
            return n;
        }
        return (n%10)* (int)Math.pow(10,(digits-1))+helper(n/10,digits-1);
    }
    static boolean palindrome(int n){
        return n==way2(n);
    }
}

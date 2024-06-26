package Recursion.Questions;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(98765));
        System.out.println(sumDigits(98765));
    }
    static int countDigits(int n){
        if(n<10){
            return 1;
        }
        return 1+countDigits(n/10);
    }
    static int sumDigits(int n){
        if(n<10){
            return n;
        }
        return n%10+sumDigits(n/10);
    }
}

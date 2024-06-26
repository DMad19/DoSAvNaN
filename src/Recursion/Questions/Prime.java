package Recursion.Questions;

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(11,2));
    }
    static boolean isPrime(int n,int i){
        if(n==2){
            return true;
        }
        if(n%i==0){
            return false;
        }
        if(i*i>n){
            return true;
        }
        return isPrime(n,i+1);
    }
}

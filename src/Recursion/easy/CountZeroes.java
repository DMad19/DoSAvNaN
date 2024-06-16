package Recursion.easy;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(countZeroes(0));
    }
    static int countZeroes(int n){
        int c = 0;
        return helper(n,c);
    }
    static int helper(int n,int c){
        if(n==0){
            return c;
        }
        if(n%10==0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }
}

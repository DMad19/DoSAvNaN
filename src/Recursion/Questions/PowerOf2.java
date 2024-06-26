package Recursion.Questions;

public class PowerOf2 {
    public static void main(String[] args) {
        System.out.println(powOf2(16));
    }
    static boolean powOf2(int n){
        if(n==1){
            return true;
        }
        if(n%2!=0 || n==0){
            return false;
        }
        return powOf2(n/2);
    }
}

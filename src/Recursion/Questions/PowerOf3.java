package Recursion.Questions;

public class PowerOf3 {
    public static void main(String[] args) {
        System.out.println(po3(3));
    }
    static boolean po3(int n){
        if(n==1){
            return true;
        }
        if(n==0 || n%3!=0){
            return false;
        }
        return po3(n/3);
    }
}

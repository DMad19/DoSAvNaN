package Recursion.Questions;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        System.out.println(product(3,12));
    }
    static int product(int a,int b){
        if(b==1){
            return a;
        }
        return a+(product(a,b-1));
    }
}

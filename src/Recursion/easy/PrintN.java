package Recursion.easy;

public class PrintN {
    public static void main(String[] args) {
        printfromN(5);
        printtoN(5);
        printtoANDfromN(5);
    }
    static void printfromN(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printfromN(n-1);
    }
    static void printtoN(int n){
        if(n==0){
            System.out.println();
            return;
        }
        printtoN(n-1);
        System.out.print(n+" ");
    }
    static void printtoANDfromN(int n){
        if(n==0){
            System.out.println();
            return;
        }
        System.out.print(n+" ");
        printtoANDfromN(n-1);
        System.out.print(n+" ");
    }
}

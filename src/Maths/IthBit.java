package Maths;

public class IthBit {
    public static void main(String[] args) {
        int n = 10;
        int k = 5 ;
        System.out.println((n&(1<<(k-1)))>>(k-1));
    }
}

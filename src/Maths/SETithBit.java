package Maths;

public class SETithBit {
    public static void main(String[] args) {
        int n = 10;
        int k = 4;
        int maskedBit = 1<<(k-1);
        System.out.println(n|maskedBit);
    }
}

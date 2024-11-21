package MathsOrBitMagic;

public class MagicNumber {
    public static void main(String[] args) {
        int n = 10;
        int N = n;
        int magicNumber = 0;
        for (int i = 0; i < N; i++) {
            magicNumber += ((n&1)*(Math.pow(5,i)));
            n = n >> 1;
        }
        System.out.println(magicNumber);
    }
}
package MathsOrBitMagic;

public class NumToBin {
    public static void main(String[] args) {
        numToBinary1(10);
        numToBinary2(10);
    }
    static void numToBinary1(int num) {
        for (int i = 10; i >= 0; i--) {
            System.out.print((num >> i) & 1);
        }
    }
    static void numToBinary2(int num) {
        for (int i = 10; i >= 0; i--) {
            System.out.print((1 << i) & 1);
        }
    }
}

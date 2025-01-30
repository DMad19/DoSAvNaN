package MathsOrBitMagic;

public class SETithBit {
    public static void main(String[] args) {
        int n = 50;
        int k = 4;
        int maskedBit = 1<<(k-1);
        System.out.println(n|maskedBit);
        NumToBin.numToBinary1(n);
        NumToBin.numToBinary1(maskedBit);
        NumToBin.numToBinary1(n|maskedBit);
    }
}

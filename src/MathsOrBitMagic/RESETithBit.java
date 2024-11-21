package MathsOrBitMagic;

public class RESETithBit {
    public static void main(String[] args) {
        int n = 10;
        int k = 4;
        int zeromask = (1<<(k-1));
        System.out.println(zeromask);
        int onesMask = ~zeromask;
        System.out.println(onesMask);
        System.out.println(n&onesMask);
    }
}

package MathsOrBitMagic;

public class NumToBin {
    public static void main(String[] args) {
        numToBinary1(10);
        numToBinary2(10); //will not work
    }
    static void numToBinary1(int num) {
        for (int i = 10; i >= 0; i--) {
            System.out.print((num >> i) & 1);
        }
        System.out.println();
    }
    static void numToBinary2(int num) {  //Will NOt work
        for (int i = 10; i >= 0; i--) {
            System.out.print((1 << i) & num);
        }
    }
}

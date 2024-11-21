package MathsOrBitMagic;

public class NumToBin {
    public static void main(String[] args) {
        pr_binary(10);
    }
    static void pr_binary(int num){
        for(int i=10;i>=0;i--) System.out.println(num+" "+i+" "+((num>>i)&1) );
    }
}

package MathsOrBitMagic;


public class ClearIBits {
    public static void main(String[] args) {
        int a = 59;
        NumToBin.numToBinary1(a);
        NumToBin.numToBinary1(clearLSBUptoIthBit(a,2));
        NumToBin.numToBinary1(clearMSBUptoIthBit(a,3));
    }
    static int clearLSBUptoIthBit(int a,int i){
        int b=(a&(~((1<<(i+1))-1)));
        return b;
    }
    static int clearMSBUptoIthBit(int a,int i){
        int c=(a&((1<<(i+1))-1));
        return c;
    }
}

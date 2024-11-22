package MathsOrBitMagic;

public class IsPowerOfX {
    public static void main(String[] args) {
        System.out.println(isPowerOf2(2));
        System.out.println(isPowerOf2(4));
        System.out.println(isPowerOf2(33));
        System.out.println(isPowerOf2(1));
        System.out.println(isPowerOf2(0));
    }
    static boolean isPowerOf2(int num){
        if(num!=0 && (num&(num-1))==0){
            return true;
        }
        return false;
    }
}

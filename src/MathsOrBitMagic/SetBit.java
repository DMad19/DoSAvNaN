package MathsOrBitMagic;

public class SetBit {
    public static void main(String[] args) {
        System.out.println(isIthBitSet(10,0));
        System.out.println(isIthBitSet(10,1));
        System.out.println(isIthBitSet(10,2));
        System.out.println(isIthBitSet(10,3));
        System.out.println(getCountOfSetBits(7));
        System.out.println(getCountOfSetBits2(5));
    }
    static boolean isIthBitSet(int num,int i){
        return ((1<<i)&num)!=0;
    }
    static int getCountOfSetBits(int num){
        int count = 0;
        for (int i = 31; i >=0 ; i--) {
            if(((num>>i)&1)!=0){
                count+=1;
            }
        }
        return count;
    }
    static int getCountOfSetBits2(int num){
        int count = 0;
        for (int i = 31; i >=0 ; i--) {
            if((num&(1<<i))!=0){
                count +=1;
            }
        }
        return count;
    }
}

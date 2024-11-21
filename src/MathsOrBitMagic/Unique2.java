package MathsOrBitMagic;

public class Unique2 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,4,5,4,5,4,5};
        int sum = 0;
        for(int i:arr){
            sum+=i;
        }
        System.out.println(1<<1);
        System.out.println(sum);
        System.out.println(sum%3);
    }
}

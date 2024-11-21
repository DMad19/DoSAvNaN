package MathsOrBitMagic;

public class ApowerB {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int ans = 1;
        while(b>0){
            if((b&1)==1){
                ans *= (b&1)*a;
            }
            b = b>>1;
            a = a *a;
        }
        System.out.println(ans);
    }
}

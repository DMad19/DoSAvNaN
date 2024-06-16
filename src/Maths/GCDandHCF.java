package Maths;

public class GCDandHCF {
    public static void main(String[] args) {
        int a = 19;
        int b = 17;
        System.out.println(hcf(a,b));
        System.out.println(lcm(a,b));
    }
    static int hcf(int a, int b){
        if(a==0){
            return b;
        }
        return hcf(b%a,a);
    }
    static int lcm(int a, int b){
        return (a*b)/hcf(a,b);
    }
}

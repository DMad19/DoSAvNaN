package MathsOrBitMagic;

public class SQRT {
    public static void main(String[] args) {
        int n = 37;
        int s = 0;
        int e = n;
        double root = 0.0;
        int precision = 3;
        while(s<e){
            int mid = s+(e-s)/2;
            if(mid*mid == n){
                root = mid;
                System.out.println(root);
                return;
            }
            else if(mid*mid<n){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        root = e;
        double incr = 0.1;
        for (int i = 0; i <precision; i++) {
            while(root*root<n){
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        System.out.println(root);
    }
}

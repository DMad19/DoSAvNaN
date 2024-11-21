package MathsOrBitMagic;

public class NewtonRaphson {
    public static void main(String[] args) {
        int n = 40;
        double root = 0.0;
        double x = n;
        while(true){
            root = 0.5*(x+n/x);
            if(Math.abs(root-x)<0.1){
                break;
            }
            x = root;
        }
        System.out.println(root);
    }
}

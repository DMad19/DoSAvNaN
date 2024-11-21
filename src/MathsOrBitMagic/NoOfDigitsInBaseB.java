package MathsOrBitMagic;

public class NoOfDigitsInBaseB {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("binary : "+ ((int) (Math.log(n)/Math.log(2))+1));
        System.out.println("decimal : "+ ((int) (Math.log(n)/Math.log(10))+1));
    }
}

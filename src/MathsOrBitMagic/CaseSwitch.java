package MathsOrBitMagic;

public class CaseSwitch {
    public static void main(String[] args) {
        System.out.println((char) lowerToUpper('b'));
        System.out.println((char) upperToLower('B'));
    }
    static int lowerToUpper(char c){
        return (c&'_');
    }
    static int upperToLower(char c){
        return (c|' ');
    }
}

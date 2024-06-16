package Recursion.Strings;

public class Skip {
    public static void main(String[] args) {
        String up = "aabbcc";
        char a = 'b';
        String p = skip("",up,a);
        System.out.println(p);
        String p2 = skip2(up,a);
        System.out.println(p2);
    }
    static String skip(String p,String up,char a){
        if(up.isEmpty()){
            return p;
        }
        if(up.charAt(0) == a){
            return skip(p,up.substring(1),a);
        }
        p += up.charAt(0);
        return skip(p,up.substring(1),a);
    }
    static String skip2(String up,char a){
        if(up.isEmpty()){
            return up;
        }
        if(up.charAt(0) == a){
            return skip2(up.substring(1),a);
        }
        return up.charAt(0)+skip2(up.substring(1),a);
    }
}

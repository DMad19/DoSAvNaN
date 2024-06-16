package Recursion.Strings;

public class SkipString {
    public static void main(String[] args) {
        System.out.println(skipString("abcappleanbasd","apple"));
        System.out.println(skipString2("asdadappasd","app","apple"));
    }
    static String skipString(String s,String ss){
        if(s.isEmpty()){
            return s;
        }
        if(s.startsWith(ss)){
            return skipString(s.substring(ss.length()),ss);
        }
        return s.charAt(0) +skipString(s.substring(1),ss);
    }
    static String skipString2(String s,String ss,String sns){
        if(s.isEmpty()){
            return s;
        }
        if(s.startsWith(ss) && !s.startsWith(sns)){
            return skipString2(s.substring(ss.length()),ss,sns);
        }
        return s.charAt(0) +skipString2(s.substring(1),ss,sns);
    }
}

package LinearSearch;

import java.util.Scanner;

public class StringLinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "";
        a = sc.nextLine();
        System.out.println(search(a,'d'));
        System.out.println(search2(a,'o'));

    }
    static int search(String a,char target){
        if(a.isEmpty()){
            return -1;
        }
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)==target){
                return i;
            }
        }
        return -1;
    }
    static boolean search2(String a,char target){
        if(a.isEmpty()){
            return false;
        }
        for(char i:a.toCharArray()){
            if(i==target){
                return true;
            }
        }
        return false;
    }
}

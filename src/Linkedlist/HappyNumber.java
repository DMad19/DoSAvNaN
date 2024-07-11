package Linkedlist;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(12));
    }
    static boolean isHappy(int n){
        int slow = n;
        int fast = n;
        do{
            slow = findSquare(slow);
            fast = findSquare(fast);
            fast = findSquare(fast);
        }while(slow!=fast);
        if(slow==1){
            return true;
        }
        return false;
    }
    static int findSquare(int n){
        int ans = 0;
        while(n>0){
            int rem = n%10;
            ans += rem * rem;
            n = n/10;
        }
        return ans;
    }
}

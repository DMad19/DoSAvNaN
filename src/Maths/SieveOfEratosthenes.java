package Maths;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n=40;
        boolean[] arr = new boolean[n+1];
        for (int i = 2; i*i <= n; i++) {
            if(!arr[i]){
                for(int j=i*i;j<=n;j+=i){
                    arr[j] = true;
                }
            }
        }
        for (int i = 2; i < arr.length; i++) {
            if(!arr[i]){
                System.out.print(i+" ");
            }
        }
    }
}
